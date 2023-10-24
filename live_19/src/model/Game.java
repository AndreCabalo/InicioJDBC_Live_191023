package model;

import java.time.LocalDate;

public class Game {

    private int CODIGO;
    private String TITULO;
    private LocalDate DATA_LANCAMENTO;
    private boolean FINALIZADO;


    public Game(int cODIGO, String tITULO, LocalDate dATA_LANCAMENTO, boolean fINALIZADO) {
        CODIGO = cODIGO;
        TITULO = tITULO;
        DATA_LANCAMENTO = dATA_LANCAMENTO;
        FINALIZADO = fINALIZADO;
    }

    public Game() {
    }

    public int getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(int cODIGO) {
        CODIGO = cODIGO;
    }

    public String getTITULO() {
        return TITULO;
    }

    public void setTITULO(String tITULO) {
        TITULO = tITULO;
    }

    public LocalDate getDATA_LANCAMENTO() {
        return DATA_LANCAMENTO;
    }

    public void setDATA_LANCAMENTO(LocalDate dATA_LANCAMENTO) {
        DATA_LANCAMENTO = dATA_LANCAMENTO;
    }

    public boolean isFINALIZADO() {
        return FINALIZADO;
    }

    public void setFINALIZADO(boolean fINALIZADO) {
        FINALIZADO = fINALIZADO;
    }


    //SystemOut é para quando dermos um print ele mostra os dados do objeto e não a referencia do objeto
    @Override
    public String toString() {
        return "Game [CODIGO=" + CODIGO + ", TITULO=" + TITULO + ", DATA_LANCAMENTO=" + DATA_LANCAMENTO
                + ", FINALIZADO=" + FINALIZADO + "]";
    }






}
