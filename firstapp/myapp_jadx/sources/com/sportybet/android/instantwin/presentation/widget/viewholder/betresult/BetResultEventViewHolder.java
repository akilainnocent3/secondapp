package com.sportybet.android.instantwin.presentation.widget.viewholder.betresult;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.widget.viewholder.betresult.BetResultEventViewHolder;
import defpackage.abn;
import defpackage.b5p;
import defpackage.bqe;
import defpackage.c8i0;
import defpackage.ge3;
import defpackage.ht;
import defpackage.m9n;
import defpackage.nan;
import defpackage.o0z;
import defpackage.op8;
import defpackage.peo;
import defpackage.pp8;
import defpackage.qeo;
import defpackage.qw90;
import defpackage.s0b;
import defpackage.u7n;
import defpackage.zbn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/viewholder/betresult/BetResultEventViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Lb5p;", "binding", "", "isBNG", "<init>", "(Lb5p;Z)V", "Lge3;", "item", "", "setData", "(Lge3;)V", "Lb5p;", "Z", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetResultEventViewHolder extends BaseViewHolder {
    public static final int $stable = 8;
    private final b5p binding;
    private final boolean isBNG;

    /* JADX WARN: Illegal instructions before constructor call */
    public BetResultEventViewHolder(b5p b5pVar, boolean z) {
        b5pVar.getClass();
        RelativeLayout relativeLayout = b5pVar.a;
        relativeLayout.getClass();
        super(relativeLayout);
        this.binding = b5pVar;
        this.isBNG = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$2$0(final ge3 ge3Var, a aVar, int i) {
        if (aVar.q(i & 1, (i & 3) != 2)) {
            o0z.a(null, null, null, null, null, pp8.b(1829957130, new Function2() { // from class: lx2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BetResultEventViewHolder.setData$lambda$0$2$0$0(ge3Var, (a) obj, iIntValue);
                }
            }, aVar), aVar, 196608);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$0$2$0$0(ge3 ge3Var, a aVar, int i) {
        if (aVar.q(i & 1, (i & 3) != 2)) {
            qeo qeoVar = ge3Var.F;
            qeoVar.getClass();
            peo.b(null, qeoVar, ht.a.e, aVar, 384, 1);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    public final void setData(final ge3 item) {
        item.getClass();
        b5p b5pVar = this.binding;
        View view = b5pVar.e;
        view.setVisibility(0);
        b5pVar.i.setText(item.c);
        ImageView imageView = b5pVar.f;
        String str = item.d;
        m9n m9nVarA = qw90.a(imageView.getContext());
        nan.a aVar = new nan.a(imageView.getContext());
        aVar.c = str;
        abn.f(aVar, imageView);
        Context context = this.binding.a.getContext();
        context.getClass();
        Drawable drawableC = s0b.c(context, R.drawable.ic_default_team_logo_home, null, null, 6);
        u7n u7nVarB = drawableC != null ? zbn.b(drawableC) : null;
        aVar.d(u7nVarB);
        aVar.b(u7nVarB);
        m9nVarA.a(aVar.a());
        b5pVar.c.setText(item.i);
        ImageView imageView2 = b5pVar.b;
        String str2 = item.v;
        m9n m9nVarA2 = qw90.a(imageView2.getContext());
        nan.a aVar2 = new nan.a(imageView2.getContext());
        aVar2.c = str2;
        abn.f(aVar2, imageView2);
        Context context2 = this.binding.a.getContext();
        context2.getClass();
        Drawable drawableC2 = s0b.c(context2, R.drawable.ic_default_team_logo_away, null, null, 6);
        u7n u7nVarB2 = drawableC2 != null ? zbn.b(drawableC2) : null;
        aVar2.d(u7nVarB2);
        aVar2.b(u7nVarB2);
        m9nVarA2.a(aVar2.a());
        b5pVar.v.setText(item.z + " - " + item.A);
        qeo qeoVar = item.F;
        ComposeView composeView = b5pVar.d;
        if (qeoVar == null) {
            composeView.setVisibility(8);
        } else {
            composeView.setVisibility(0);
            composeView.setContent(new op8(1704361499, new Function2() { // from class: mx2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return BetResultEventViewHolder.setData$lambda$0$2$0(item, (a) obj, iIntValue);
                }
            }, true));
        }
        int iA = bqe.a(12.0f);
        if (this.isBNG) {
            c8i0.l(view, 0, Integer.valueOf(iA), 0, 0);
        } else {
            int iA2 = bqe.a(10.0f);
            c8i0.l(view, Integer.valueOf(iA2), Integer.valueOf(iA), Integer.valueOf(iA2), 0);
        }
    }
}
