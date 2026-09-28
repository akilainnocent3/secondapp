package com.sportygames.commons.utils;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportygames/commons/utils/CustomLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CustomLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void t0(RecyclerView.u uVar, RecyclerView.z zVar) {
        try {
            super.t0(uVar, zVar);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
