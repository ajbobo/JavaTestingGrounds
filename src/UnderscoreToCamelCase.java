public class UnderscoreToCamelCase {

    private static String camelCase(String value, boolean CapFirst) {
        String[] parts = value.split("_");
        value = "";
        int i = 1;
        for (String part : parts) {
            if (i == 1 && !CapFirst) {
                value += part.substring(0, 1).toLowerCase() + part.substring(1).toLowerCase();
            }
            else {
                value += part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
            }
            i++;
        }
        return value;
    }

    public static void main(String[] args) {

        String vals[] = {"actions_offsite_conversion.fb_pixel_purchase","action_values_offsite_conversion.fb_pixel_purchase"};

        for (String val : vals)
            System.out.println(val + "->" + camelCase(val, true));
    }
}
