def call(Map input = [:]) {
    validateArguments(input, [ 'pom' ])
	xml = readMavenPom file: input.pom
	List dependencies = []
    xml.dependencies.each {
        dependencies << it.artifactId
    }
    dependencies
}
