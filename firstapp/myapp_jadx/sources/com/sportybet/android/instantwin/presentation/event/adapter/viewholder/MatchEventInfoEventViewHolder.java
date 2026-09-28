package com.sportybet.android.instantwin.presentation.event.adapter.viewholder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.gp.tz.R;
import defpackage.a5p;
import defpackage.abn;
import defpackage.cq40;
import defpackage.ja3;
import defpackage.m9n;
import defpackage.mpg;
import defpackage.nan;
import defpackage.op8;
import defpackage.qw90;
import defpackage.s0b;
import defpackage.sn5;
import defpackage.u7n;
import defpackage.zbn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/event/adapter/viewholder/MatchEventInfoEventViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "La5p;", "binding", "<init>", "(La5p;)V", "Lmpg;", "item", "", "bind", "(Lmpg;)V", "La5p;", "Companion", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchEventInfoEventViewHolder extends BaseViewHolder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final a5p binding;

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventInfoEventViewHolder$a, reason: from kotlin metadata */
    public static final class Companion {
    }

    public static final class b implements View.OnClickListener {
        public final /* synthetic */ cq40 a;
        public final /* synthetic */ mpg b;

        public b(cq40 cq40Var, mpg mpgVar) {
            this.a = cq40Var;
            this.b = mpgVar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            cq40 cq40Var = this.a;
            if (jCurrentTimeMillis - cq40Var.a < 350) {
                return;
            }
            cq40Var.a = jCurrentTimeMillis;
            view.getClass();
            mpg mpgVar = this.b;
            mpgVar.m.h(mpgVar);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MatchEventInfoEventViewHolder(a5p a5pVar) {
        a5pVar.getClass();
        ConstraintLayout constraintLayout = a5pVar.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.binding = a5pVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0$3(mpg mpgVar, View view) {
        mpgVar.m.i(mpgVar);
    }

    public final void bind(mpg item) {
        item.getClass();
        a5p a5pVar = this.binding;
        ConstraintLayout constraintLayout = a5pVar.a;
        ImageView imageView = a5pVar.e;
        constraintLayout.getClass();
        constraintLayout.setOnClickListener(new b(new cq40(), item));
        ImageView imageView2 = a5pVar.f;
        String str = item.e;
        m9n m9nVarA = qw90.a(imageView2.getContext());
        nan.a aVar = new nan.a(imageView2.getContext());
        aVar.c = str;
        abn.f(aVar, imageView2);
        ConstraintLayout constraintLayout2 = a5pVar.a;
        Context context = constraintLayout2.getContext();
        context.getClass();
        Drawable drawableC = s0b.c(context, R.drawable.ic_default_team_logo_home, null, null, 6);
        u7n u7nVarB = drawableC != null ? zbn.b(drawableC) : null;
        aVar.d(u7nVarB);
        aVar.b(u7nVarB);
        m9nVarA.a(aVar.a());
        a5pVar.v.setText(item.d);
        a5pVar.i.setText(item.g);
        ImageView imageView3 = a5pVar.d;
        String str2 = item.h;
        m9n m9nVarA2 = qw90.a(imageView3.getContext());
        nan.a aVar2 = new nan.a(imageView3.getContext());
        aVar2.c = str2;
        abn.f(aVar2, imageView3);
        Context context2 = constraintLayout2.getContext();
        context2.getClass();
        Drawable drawableC2 = s0b.c(context2, R.drawable.ic_default_team_logo_away, null, null, 6);
        u7n u7nVarB2 = drawableC2 != null ? zbn.b(drawableC2) : null;
        aVar2.d(u7nVarB2);
        aVar2.b(u7nVarB2);
        m9nVarA2.a(aVar2.a());
        ComposeView composeView = a5pVar.c;
        final int i = item.f;
        int i2 = 1;
        composeView.setContent(new op8(-875120259, new Function2() { // from class: zjo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final int i3 = i;
                    o0z.a(null, null, null, null, null, pp8.b(-1709513684, new Function2() { // from class: ako
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar4 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                dko.a(0.0f, 0.0f, i3, aVar4, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        ComposeView composeView2 = a5pVar.b;
        final int i3 = item.i;
        composeView2.setContent(new op8(-875120259, new Function2() { // from class: zjo
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar3 = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final int i4 = i3;
                    o0z.a(null, null, null, null, null, pp8.b(-1709513684, new Function2() { // from class: ako
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar4 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                dko.a(0.0f, 0.0f, i4, aVar4, 0);
                            } else {
                                aVar4.G();
                            }
                            return Unit.a;
                        }
                    }, aVar3), aVar3, 196608);
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
        TextView textView = a5pVar.w;
        Context context3 = this.itemView.getContext();
        context3.getClass();
        textView.setText(sn5.b(context3, R.string.page_instant_virtual__market_num, String.valueOf(item.j)));
        imageView.setVisibility(item.l ? 0 : 8);
        imageView.setOnClickListener(new ja3(item, i2));
    }
}
