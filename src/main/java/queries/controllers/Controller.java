package queries.controllers;

import queries.views.Presenter;

public abstract class Controller {
    public <T extends Presenter>void view(T presenter){}

}
