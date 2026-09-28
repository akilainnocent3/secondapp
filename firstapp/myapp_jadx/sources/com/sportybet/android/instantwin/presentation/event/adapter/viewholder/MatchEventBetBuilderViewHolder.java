package com.sportybet.android.instantwin.presentation.event.adapter.viewholder;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventBetBuilderViewHolder;
import defpackage.cq40;
import defpackage.hce0;
import defpackage.mpg;
import defpackage.o0z;
import defpackage.op8;
import defpackage.pp8;
import defpackage.syu;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/event/adapter/viewholder/MatchEventBetBuilderViewHolder;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(Landroidx/compose/ui/platform/ComposeView;)V", "Lmpg;", "item", "Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderConfig;", "config", "", "bind", "(Lmpg;Lcom/sportybet/android/instantwin/newtork/model/response/BetBuilderConfig;)V", "Landroidx/compose/ui/platform/ComposeView;", "Companion", "a", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class MatchEventBetBuilderViewHolder extends BaseViewHolder {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private final ComposeView composeView;

    /* JADX INFO: renamed from: com.sportybet.android.instantwin.presentation.event.adapter.viewholder.MatchEventBetBuilderViewHolder$a, reason: from kotlin metadata */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchEventBetBuilderViewHolder(ComposeView composeView) {
        super(composeView);
        composeView.getClass();
        this.composeView = composeView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(final mpg mpgVar, final BetBuilderConfig betBuilderConfig, a aVar, int i) {
        if (aVar.q(i & 1, (i & 3) != 2)) {
            o0z.a(null, null, null, null, null, pp8.b(-782127900, new Function2() { // from class: pyu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return MatchEventBetBuilderViewHolder.bind$lambda$1$0(mpgVar, betBuilderConfig, (a) obj, iIntValue);
                }
            }, aVar), aVar, 196608);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1$0(mpg mpgVar, BetBuilderConfig betBuilderConfig, a aVar, int i) {
        List<String> list;
        if (aVar.q(i & 1, (i & 3) != 2)) {
            String str = mpgVar.d;
            str.getClass();
            String str2 = mpgVar.e;
            str2.getClass();
            int i2 = mpgVar.f;
            String str3 = mpgVar.g;
            str3.getClass();
            String str4 = mpgVar.h;
            str4.getClass();
            int i3 = mpgVar.i;
            String strA = (betBuilderConfig == null || (list = betBuilderConfig.supportMarkets) == null) ? null : hce0.a(list.size(), " +");
            if (strA == null) {
                strA = "";
            }
            syu.a(str, str2, i2, str3, str4, i3, strA, aVar, 0);
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    public final void bind(final mpg item, final BetBuilderConfig config) {
        item.getClass();
        this.composeView.setOnClickListener(new b(new cq40(), item));
        this.composeView.setContent(new op8(-532739339, new Function2() { // from class: oyu
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj2).intValue();
                return MatchEventBetBuilderViewHolder.bind$lambda$1(item, config, (a) obj, iIntValue);
            }
        }, true));
    }
}
