/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package src;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple unit test for the 'src.greeting' plugin.
 */
class ProjectGooglePluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("src.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
