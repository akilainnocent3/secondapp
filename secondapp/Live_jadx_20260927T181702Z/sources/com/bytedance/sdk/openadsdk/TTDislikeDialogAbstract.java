package com.bytedance.sdk.openadsdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.sd.nod;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class TTDislikeDialogAbstract extends Dialog implements nod.tq {
    protected String hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    protected final nod f35178sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    protected List<FilterWord> f35179tq;
    private View vy;

    public TTDislikeDialogAbstract(@NonNull Context context) {
        super(context);
        nod nodVar = new nod();
        this.f35178sd = nodVar;
        nodVar.hww(this);
    }

    public void destroy() {
        nod nodVar = this.f35178sd;
        if (nodVar != null) {
            nodVar.hww();
        }
    }

    public nod getDislikeManager() {
        return this.f35178sd;
    }

    public abstract ViewGroup.LayoutParams getLayoutParams();

    public abstract View getLayoutView();

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.vy = getLayoutView();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        View view = this.vy;
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        }
        setContentView(view, layoutParams);
    }

    public void onSuggestionSubmit(String str) {
        nod nodVar = this.f35178sd;
        if (nodVar != null) {
            nodVar.sd(str);
        }
    }

    public void setMaterialMeta(String str, List<FilterWord> list) {
        this.hww = str;
        this.f35179tq = list;
        this.f35178sd.hww(str);
        this.f35178sd.hww(this.f35179tq);
    }

    public TTDislikeDialogAbstract(@NonNull Context context, int i10) {
        super(context, i10);
        nod nodVar = new nod();
        this.f35178sd = nodVar;
        nodVar.hww(this);
    }
}
