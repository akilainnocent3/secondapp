package com.yandex.div.core.util;

import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class SearchRoute<T> {
    private int enterLeaveBalance;

    @m
    private final T item;
    private int movedDistance;

    public SearchRoute(@m T t10) {
        this.item = t10;
    }

    public final int distance() {
        return this.movedDistance;
    }

    @m
    public final T getItem() {
        return this.item;
    }

    public final void onEnter() {
        this.enterLeaveBalance++;
        this.movedDistance++;
    }

    public final void onLeave() {
        int i10 = this.enterLeaveBalance;
        if (i10 <= 0) {
            this.movedDistance++;
        } else {
            this.enterLeaveBalance = i10 - 1;
            this.movedDistance--;
        }
    }
}
