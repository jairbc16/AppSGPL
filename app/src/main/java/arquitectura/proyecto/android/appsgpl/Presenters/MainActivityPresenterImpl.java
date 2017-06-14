package arquitectura.proyecto.android.appsgpl.Presenters;

import java.util.List;

import arquitectura.proyecto.android.appsgpl.Interactors.MainActivityInteractorImpl;
import arquitectura.proyecto.android.appsgpl.Interfaces.MainActivityInteractor;
import arquitectura.proyecto.android.appsgpl.Interfaces.MainActivityPresenter;
import arquitectura.proyecto.android.appsgpl.Interfaces.MainActivityView;
import arquitectura.proyecto.android.appsgpl.POJOS.Proyecto;

/**
 * Created by Jair Barzola on 21-Apr-17.
 */

public class MainActivityPresenterImpl implements MainActivityPresenter {

    private MainActivityInteractor interactor;
    private MainActivityView view;
    private int id;

    public MainActivityPresenterImpl(MainActivityView view, int id){
        this.view=view;
        interactor = new MainActivityInteractorImpl(this, this.id);
    }
    @Override
    public void initRecycler(List<Proyecto> proyectoList) {
        view.initRecycler(proyectoList);
    }

    @Override
    public void loadListProyecto() {
        interactor.initRecycler();
    }

    @Override
    public void showEmpty() {
        view.showEmpty();
    }

    @Override
    public void hideProgress() {
        view.hideProgress();
    }

    @Override
    public void showProgress() {
        view.showProgress();
    }
}
