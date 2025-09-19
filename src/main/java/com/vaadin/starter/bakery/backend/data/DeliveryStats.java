package com.vaadin.starter.bakery.backend.data;

/**
 * Representa estatísticas relacionadas às entregas de pedidos,
 * incluindo entregas realizadas, pendentes e novos pedidos.
 */
public class DeliveryStats {

    /** Número de entregas realizadas hoje. */
    private int deliveredToday;

    /** Número de entregas previstas para hoje. */
    private int dueToday;

    /** Número de entregas previstas para amanhã. */
    private int dueTomorrow;

    /** Número de pedidos não disponíveis para entrega hoje. */
    private int notAvailableToday;

    /** Número de novos pedidos recebidos. */
    private int newOrders;

    /**
     * Obtém o número de entregas realizadas hoje.
     *
     * @return entregas realizadas hoje
     */
    public int getDeliveredToday() {
        return deliveredToday;
    }

    /**
     * Define o número de entregas realizadas hoje.
     *
     * @param deliveredToday entregas realizadas hoje
     */
    public void setDeliveredToday(int deliveredToday) {
        this.deliveredToday = deliveredToday;
    }

    /**
     * Obtém o número de entregas previstas para hoje.
     *
     * @return entregas previstas para hoje
     */
    public int getDueToday() {
        return dueToday;
    }

    /**
     * Define o número de entregas previstas para hoje.
     *
     * @param dueToday entregas previstas para hoje
     */
    public void setDueToday(int dueToday) {
        this.dueToday = dueToday;
    }

    /**
     * Obtém o número de entregas previstas para amanhã.
     *
     * @return entregas previstas para amanhã
     */
    public int getDueTomorrow() {
        return dueTomorrow;
    }

    /**
     * Define o número de entregas previstas para amanhã.
     *
     * @param dueTomorrow entregas previstas para amanhã
     */
    public void setDueTomorrow(int dueTomorrow) {
        this.dueTomorrow = dueTomorrow;
    }

    /**
     * Obtém o número de pedidos não disponíveis para entrega hoje.
     *
     * @return pedidos não disponíveis hoje
     */
    public int getNotAvailableToday() {
        return notAvailableToday;
    }

    /**
     * Define o número de pedidos não disponíveis para entrega hoje.
     *
     * @param notAvailableToday pedidos não disponíveis hoje
     */
    public void setNotAvailableToday(int notAvailableToday) {
        this.notAvailableToday = notAvailableToday;
    }

    /**
     * Obtém o número de novos pedidos recebidos.
     *
     * @return novos pedidos
     */
    public int getNewOrders() {
        return newOrders;
    }

    /**
     * Define o número de novos pedidos recebidos.
     *
     * @param newOrders novos pedidos
     */
    public void setNewOrders(int newOrders) {
        this.newOrders = newOrders;
    }
}