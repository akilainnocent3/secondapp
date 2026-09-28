package com.sportybet.android.instantwin.presentation.buildandgo;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.a;
import androidx.compose.runtime.m;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Sports;
import com.sportybet.android.instantwin.presentation.buildandgo.FeaturedInstantVirtualView;
import defpackage.at3;
import defpackage.cf5;
import defpackage.ct3;
import defpackage.lg5;
import defpackage.o0z;
import defpackage.pp8;
import defpackage.py9;
import defpackage.qeh;
import defpackage.rg;
import defpackage.u6i0;
import defpackage.x5a0;
import defpackage.ytw;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010$\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/buildandgo/FeaturedInstantVirtualView;", "Lcom/sporty/android/compose/ui/component/RevivableComposeView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/sportybet/android/instantwin/newtork/model/response/Sports;", "bngSportConfig", "Lcom/sportybet/android/instantwin/newtork/model/response/Round;", "bngRound", "", "setData", "(Lcom/sportybet/android/instantwin/newtork/model/response/Sports;Lcom/sportybet/android/instantwin/newtork/model/response/Round;)V", "Lu6i0$c;", "getViewCompositionStrategy", "()Lu6i0$c;", "Lcom/sportybet/android/instantwin/presentation/buildandgo/f;", "e", "Lcom/sportybet/android/instantwin/presentation/buildandgo/f;", "getBuildAndGoViewModel", "()Lcom/sportybet/android/instantwin/presentation/buildandgo/f;", "setBuildAndGoViewModel", "(Lcom/sportybet/android/instantwin/presentation/buildandgo/f;)V", "buildAndGoViewModel", "Lqeh;", "<set-?>", "f", "Lytw;", "getUiState", "()Lqeh;", "setUiState", "(Lqeh;)V", "uiState", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class FeaturedInstantVirtualView extends Hilt_FeaturedInstantVirtualView {
    public static final /* synthetic */ int i = 0;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public f buildAndGoViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final ytw uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedInstantVirtualView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        context.getClass();
        this.uiState = m.b(qeh.b.a);
    }

    public static final Unit b(FeaturedInstantVirtualView featuredInstantVirtualView, androidx.compose.runtime.a aVar, int i2) {
        int i3 = 1;
        if (aVar.q(i2 & 1, (i2 & 3) != 2)) {
            qeh uiState = featuredInstantVirtualView.getUiState();
            if (uiState instanceof qeh.a) {
                aVar.N(-1862664900);
                f fVar = featuredInstantVirtualView.buildAndGoViewModel;
                if (fVar == null) {
                    aVar.N(-1862664901);
                    aVar.H();
                } else {
                    aVar.N(-1862664900);
                    qeh.a aVar2 = (qeh.a) uiState;
                    c.d(aVar2.a, py9.a(aVar2.b), fVar, aVar, Sports.$stable | (cf5.d << 3) | 512);
                    aVar.H();
                    Unit unit = Unit.a;
                }
                aVar.H();
            } else if (uiState instanceof qeh.c) {
                aVar.N(-1862272378);
                boolean zA = aVar.A(featuredInstantVirtualView);
                Object objY = aVar.y();
                if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new ct3(featuredInstantVirtualView, i3);
                    aVar.r(objY);
                }
                lg5.b((Function0) objY, aVar, 0);
                aVar.H();
            } else {
                if (!Intrinsics.g(uiState, qeh.b.a)) {
                    throw rg.a(-1584110271, aVar);
                }
                aVar.N(-1862037646);
                aVar.H();
            }
        } else {
            aVar.G();
        }
        return Unit.a;
    }

    private final qeh getUiState() {
        return (qeh) ((x5a0) this.uiState).getValue();
    }

    private final void setUiState(qeh qehVar) {
        ((x5a0) this.uiState).setValue(qehVar);
    }

    @Override // com.sporty.android.compose.ui.component.RevivableComposeView
    public final void a(final int i2, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.b bVarI = aVar.i(407989908);
        int i3 = (bVarI.A(this) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            o0z.a(null, null, null, null, null, pp8.b(-1194943163, new at3(this), bVarI), bVarI, 196608);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2) { // from class: reh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int i4 = FeaturedInstantVirtualView.i;
                    int iA = qj40.a(1);
                    this.a.a(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final f getBuildAndGoViewModel() {
        return this.buildAndGoViewModel;
    }

    public final void setBuildAndGoViewModel(f fVar) {
        this.buildAndGoViewModel = fVar;
    }

    public final void setData(Sports bngSportConfig, Round bngRound) {
        bngSportConfig.getClass();
        setUiState(bngRound != null ? new qeh.a(bngSportConfig, bngRound) : qeh.c.a);
    }

    @Override // com.sporty.android.compose.ui.component.RevivableComposeView
    public u6i0.c getViewCompositionStrategy() {
        return u6i0.c.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedInstantVirtualView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FeaturedInstantVirtualView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ FeaturedInstantVirtualView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }
}
