package com.sportybet.plugin.realsports.event.viewholder;

import android.view.View;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.c2p;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ViewHolder extends BaseViewHolder {
    public ViewHolder(View view) {
        super(view);
    }

    public abstract void bind(c2p c2pVar);

    public void onViewRecycled() {
    }
}
