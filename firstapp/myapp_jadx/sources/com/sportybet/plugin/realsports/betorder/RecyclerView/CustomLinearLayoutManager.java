package com.sportybet.plugin.realsports.betorder.RecyclerView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ium;

/* JADX INFO: loaded from: classes.dex */
public class CustomLinearLayoutManager extends LinearLayoutManager implements ium {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int I0(int i, RecyclerView.u uVar, RecyclerView.z zVar) {
        try {
            return super.I0(i, uVar, zVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        try {
            super.t0(uVar, zVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    @Override // defpackage.ium
    public final CustomLinearLayoutManager n() {
        return this;
    }
}
