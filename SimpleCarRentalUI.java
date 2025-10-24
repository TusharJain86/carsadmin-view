import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SimpleCarRentalUI extends JFrame {

    private CarRentalSystem carSystem;
    private JTextField idField, brandField, modelField, rentField, removeIdField;
    private JTextArea displayArea;

    public SimpleCarRentalUI() {
        carSystem = new CarRentalSystem();

        setTitle("Car Rental System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        // Input fields
        add(new JLabel("Car ID:"));
        idField = new JTextField(10);
        add(idField);

        add(new JLabel("Brand:"));
        brandField = new JTextField(10);
        add(brandField);

        add(new JLabel("Model:"));
        modelField = new JTextField(10);
        add(modelField);

        add(new JLabel("Rent per Day:"));
        rentField = new JTextField(10);
        add(rentField);

        JButton addButton = new JButton("Add Car");
        add(addButton);

        JButton showButton = new JButton("Show All Cars");
        add(showButton);

        // Display area
        displayArea = new JTextArea(10, 30);
        displayArea.setEditable(false);
        add(new JScrollPane(displayArea));

        // Remove car
        add(new JLabel("Remove Car ID:"));
        removeIdField = new JTextField(5);
        add(removeIdField);

        JButton removeButton = new JButton("Remove Car");
        add(removeButton);

        // Actions
        addButton.addActionListener(e -> addCar());
        showButton.addActionListener(e -> showAllCars());
        removeButton.addActionListener(e -> removeCar());
    }

    private void addCar() {
        try {
            int id = Integer.parseInt(idField.getText().trim());
            String brand = brandField.getText().trim();
            String model = modelField.getText().trim();
            double rent = Double.parseDouble(rentField.getText().trim());

            Car car = new Car(id, brand, model, rent);
            carSystem.addCar(car);
            JOptionPane.showMessageDialog(this, "Car added!");

            idField.setText(""); brandField.setText(""); modelField.setText(""); rentField.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid input!");
        }
    }

    private void showAllCars() {
        displayArea.setText("");
        List<Car> cars = carSystem.getCars();
        if (cars.isEmpty()) {
            displayArea.setText("No cars available.");
        } else {
            for (Car car : cars) {
                displayArea.append(car.toString() + "\n");
            }
        }
    }

    private void removeCar() {
        try {
            int id = Integer.parseInt(removeIdField.getText().trim());
            carSystem.removeCar(id);
            JOptionPane.showMessageDialog(this, "Car removed!");
            removeIdField.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Invalid ID!");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCarRentalUI().setVisible(true));
    }
}
