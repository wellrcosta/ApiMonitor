package com.monitor.apimonitor.enums;

public enum StatusApi {
    RUNNING("Running"),
    SLOW("Slow"),
    DOWN("Down"),
    UNKNOWN("Unknown");

    private final String label;

    StatusApi(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
