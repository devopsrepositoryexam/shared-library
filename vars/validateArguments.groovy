def call(Map input, List requiredArgs) {
  requiredArgs.each { argument ->
    if (!input[argument]) {
      throw new IllegalArgumentException("${argument} was not specified")
    }
  }
}