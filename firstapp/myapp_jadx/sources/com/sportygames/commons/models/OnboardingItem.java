package com.sportygames.commons.models;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/sportygames/commons/models/OnboardingItem;", "", "position", "", "isView", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;)V", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "setView", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OnboardingItem {
    public static final int $stable = 8;
    private Boolean isView;
    private final Integer position;

    public OnboardingItem(Integer num, Boolean bool) {
        this.position = num;
        this.isView = bool;
    }

    public final Integer getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: isView, reason: from getter */
    public final Boolean getIsView() {
        return this.isView;
    }

    public final void setView(Boolean bool) {
        this.isView = bool;
    }
}
