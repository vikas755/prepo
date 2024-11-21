package example.jenkins

class ExampleClass {

    private static ExampleClass instance
    private Map<String, Boolean> flags = [:]

    private ExampleClass() {
        flags['FLAG_1'] = true
        flags['FLAG_2'] = false
    }

    static ExampleClass getInstance() {
        if (instance == null) {
            instance = new ExampleClass()
        }
        return instance
    }

    Boolean getFlag(String flagName) {
        return flags[flagName]
    }

    void setFlag(String flagName, Boolean newValue) {
        flags[flagName] = newValue
    }
}
