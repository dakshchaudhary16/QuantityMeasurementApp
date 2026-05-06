/**
 * Quantity Measurement App
 *
 * Version 1.0
 * UC1: Feet Measurement Equality
 */

public class QuantityMeasurementApp {

    // -------- INNER CLASS --------
    static class Feet {

        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals method
        @Override
        public boolean equals(Object obj) {

            // Same reference check (Reflexive)
            if (this == obj) return true;

            // Null or different class check
            if (obj == null || getClass() != obj.getClass()) return false;

            // Type cast
            Feet other = (Feet) obj;

            // Compare values safely
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        System.out.println("=== Quantity Measurement App ===");

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Are both equal? " + result);
    }
}