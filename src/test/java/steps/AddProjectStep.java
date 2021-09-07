package steps;

import baseEntities.BaseStep;
import core.BrowsersService;
import models.ProjectBuilder;
import pages.NewProjectPage;
import pages.ProjectPage;

public class AddProjectStep extends BaseStep {
    public AddProjectStep(BrowsersService browsersService) {
        super(browsersService);
    }

    public void addProject(ProjectBuilder projectBuilder){
        ProjectPage projectPage = new ProjectPage(browsersService, false);
        projectPage.newProjectButton();
        NewProjectPage newProjectPage = new NewProjectPage(browsersService, false);
        newProjectPage.setName(projectBuilder.getProjectName());
        newProjectPage.setCode(projectBuilder.getProjectCode());
        newProjectPage.setDescription(projectBuilder.getDescription());
        newProjectPage.addButtonClick();

    }
}
