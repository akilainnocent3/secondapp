package com.sportybet.feature.payment.impl.deposit.presentation.viewholder;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import defpackage.abn;
import defpackage.g4z;
import defpackage.m9n;
import defpackage.nan;
import defpackage.qw90;
import defpackage.wr5;
import defpackage.yrr;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/viewholder/OthersTitleViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lyrr;", "binding", "<init>", "(Lyrr;)V", "Lg4z;", "itemEntity", "", "bindData", "(Lg4z;)V", "Lyrr;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OthersTitleViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final yrr binding;

    /* JADX WARN: Illegal instructions before constructor call */
    public OthersTitleViewHolder(yrr yrrVar) {
        yrrVar.getClass();
        ConstraintLayout constraintLayout = yrrVar.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.binding = yrrVar;
    }

    private final Context getContext() {
        Context context = this.binding.a.getContext();
        context.getClass();
        return context;
    }

    public final void bindData(g4z itemEntity) {
        itemEntity.getClass();
        yrr yrrVar = this.binding;
        AppCompatImageView appCompatImageView = yrrVar.d;
        View view = yrrVar.c;
        String str = itemEntity.a;
        m9n m9nVarA = qw90.a(appCompatImageView.getContext());
        nan.a aVar = new nan.a(appCompatImageView.getContext());
        aVar.c = str;
        abn.f(aVar, appCompatImageView);
        aVar.m = wr5.c;
        m9nVarA.a(aVar.a());
        yrrVar.e.setText(itemEntity.b.e(getContext()));
        boolean isExpanded = itemEntity.getIsExpanded();
        AppCompatImageView appCompatImageView2 = yrrVar.b;
        if (isExpanded) {
            appCompatImageView2.setRotation(90.0f);
            view.setVisibility(8);
        } else {
            appCompatImageView2.setRotation(0.0f);
            view.setVisibility(0);
        }
    }
}
