public void runCustomTrigger(String script) {
    ScriptEngineManager factory = new ScriptEngineManager(); // insure
    ScriptEngine engine = factory.getEngineByName("JavaScript"); //insecure
    engine.eval(script); //insecure
}
