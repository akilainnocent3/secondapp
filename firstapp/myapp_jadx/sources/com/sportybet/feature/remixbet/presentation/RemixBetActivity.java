package com.sportybet.feature.remixbet.presentation;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.remixbet.RemixBetOrderRequest;
import com.sporty.android.core.model.remixbet.RemixBetRequest;
import com.sportybet.feature.remixbet.presentation.RemixBetActivity;
import com.sportybet.feature.remixbet.presentation.b;
import com.sportybet.feature.remixbet.presentation.g;
import defpackage.a550;
import defpackage.arr;
import defpackage.b550;
import defpackage.c550;
import defpackage.cyb;
import defpackage.eal;
import defpackage.ej5;
import defpackage.g1i;
import defpackage.jq40;
import defpackage.k00;
import defpackage.o1m;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r350;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rn2;
import defpackage.s350;
import defpackage.s9s;
import defpackage.saj;
import defpackage.sn2;
import defpackage.tn2;
import defpackage.uhc;
import defpackage.un2;
import defpackage.v8i0;
import defpackage.wwd0;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/remixbet/presentation/RemixBetActivity;", "Lpy1;", "<init>", "()V", "Lcom/sportybet/feature/remixbet/presentation/b;", "screenState", "", "showTutorial", "remixbet"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RemixBetActivity extends o1m {
    public static final /* synthetic */ int d = 0;
    public final q8i0 b = new q8i0(jq40.a(g.class), new d(), new c(), new e());
    public com.sporty.android.common.uievent.e c;

    public static final /* synthetic */ class a extends saj implements Function1<com.sportybet.feature.remixbet.presentation.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sportybet.feature.remixbet.presentation.a aVar) {
            com.sportybet.feature.remixbet.presentation.a aVar2 = aVar;
            aVar2.getClass();
            g gVar = (g) this.receiver;
            rdd0 rdd0Var = gVar.c;
            if (aVar2.equals(com.sportybet.feature.remixbet.presentation.a.b.a)) {
                ej5.c(o8i0.d(gVar), null, null, new com.sportybet.feature.remixbet.presentation.d(gVar, null), 3);
            } else if (aVar2.equals(com.sportybet.feature.remixbet.presentation.a.e.a)) {
                if (!gVar.C.isEmpty()) {
                    int size = (gVar.C.size() + 3) / 4;
                    int i = gVar.D + 1;
                    if (i < size) {
                        gVar.D = i;
                        gVar.x1();
                    } else {
                        RemixBetRequest remixBetRequest = gVar.E;
                        if (remixBetRequest != null) {
                            RemixBetRequest remixBetRequestCopy$default = RemixBetRequest.copy$default(remixBetRequest, remixBetRequest.getSeq() + 1, null, null, null, null, null, null, WebSocketProtocol.PAYLOAD_SHORT, null);
                            remixBetRequestCopy$default.getClass();
                            gVar.E = remixBetRequestCopy$default;
                            gVar.F = null;
                            ej5.c(o8i0.d(gVar), null, null, new f(gVar, new a550(gVar, remixBetRequestCopy$default, null), null), 3);
                        } else {
                            RemixBetOrderRequest remixBetOrderRequest = gVar.F;
                            if (remixBetOrderRequest != null) {
                                RemixBetOrderRequest remixBetOrderRequestCopy$default = RemixBetOrderRequest.copy$default(remixBetOrderRequest, null, remixBetOrderRequest.getSeq() + 1, 1, null);
                                remixBetOrderRequestCopy$default.getClass();
                                gVar.E = null;
                                gVar.F = remixBetOrderRequestCopy$default;
                                ej5.c(o8i0.d(gVar), null, null, new f(gVar, new b550(gVar, remixBetOrderRequestCopy$default, null), null), 3);
                            }
                        }
                    }
                }
                rdd0Var.a(tn2.a, k00.d);
            } else if (aVar2 instanceof com.sportybet.feature.remixbet.presentation.a.C0415a) {
                gVar.e.c();
                ej5.c(o8i0.d(gVar), null, null, new com.sportybet.feature.remixbet.presentation.e(gVar, aVar2, null), 3);
            } else if (aVar2 instanceof com.sportybet.feature.remixbet.presentation.a.d) {
                rdd0Var.a(sn2.a, k00.d);
            } else if (aVar2 instanceof com.sportybet.feature.remixbet.presentation.a.c) {
                rdd0Var.a(rn2.a, k00.d);
            } else {
                if (!aVar2.equals(com.sportybet.feature.remixbet.presentation.a.f.a)) {
                    uhc.a();
                    return null;
                }
                rdd0Var.a(un2.a, k00.d, k00.c);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            g gVar = (g) this.receiver;
            wwd0 wwd0Var = gVar.A;
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            gVar.I = bool;
            ej5.c(o8i0.d(gVar), null, null, new c550(gVar, null), 3);
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return RemixBetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return RemixBetActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return RemixBetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        String stringExtra = getIntent().getStringExtra("extra_remix_bet_request");
        RemixBetRequest remixBetRequest = stringExtra != null ? (RemixBetRequest) new eal().e(stringExtra, RemixBetRequest.class) : null;
        String stringExtra2 = getIntent().getStringExtra("extra_remix_bet_order_request");
        RemixBetOrderRequest remixBetOrderRequest = stringExtra2 != null ? (RemixBetOrderRequest) new eal().e(stringExtra2, RemixBetOrderRequest.class) : null;
        z1().G = getIntent().getBooleanExtra("extra_selections_exist", false);
        boolean booleanExtra = getIntent().getBooleanExtra("extra_from_winning_popup", false);
        z1().H = booleanExtra;
        if (booleanExtra) {
            z1().I = Boolean.valueOf(getIntent().getBooleanExtra("extra_show_tutorial", true));
        }
        if (remixBetRequest != null) {
            g gVarZ1 = z1();
            gVarZ1.E = remixBetRequest;
            gVarZ1.F = null;
            ej5.c(o8i0.d(gVarZ1), null, null, new f(gVarZ1, new a550(gVarZ1, remixBetRequest, null), null), 3);
        } else {
            if (remixBetOrderRequest == null) {
                finish();
                return;
            }
            g gVarZ2 = z1();
            gVarZ2.E = null;
            gVarZ2.F = remixBetOrderRequest;
            ej5.c(o8i0.d(gVarZ2), null, null, new f(gVarZ2, new b550(gVarZ2, remixBetOrderRequest, null), null), 3);
        }
        g1i g1iVar = new g1i(z1().w, new r350(this, null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        s9s.b bVar = s9s.b.d;
        arr.a(g1iVar, lifecycle, bVar);
        g1i g1iVar2 = new g1i(z1().z, new s350(this, null));
        s9s lifecycle2 = getLifecycle();
        lifecycle2.getClass();
        arr.a(g1iVar2, lifecycle2, bVar);
        zn8.a(this, new op8(89432865, new Function2() { // from class: q350
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = RemixBetActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    RemixBetActivity remixBetActivity = this.a;
                    ytw ytwVarB = n95.b(remixBetActivity.z1().i, aVar);
                    ytw ytwVarB2 = n95.b(remixBetActivity.z1().B, aVar);
                    b bVar2 = (b) ytwVarB.getValue();
                    g gVarZ3 = remixBetActivity.z1();
                    boolean zA = aVar.A(gVarZ3);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new RemixBetActivity.a(1, gVarZ3, g.class, "handleAction", "handleAction(Lcom/sportybet/feature/remixbet/presentation/RemixBetAction;)V", 0);
                        aVar.r(objY);
                    }
                    t450.c(bVar2, (Function1) ((chp) objY), aVar, 8);
                    if (((Boolean) ytwVarB2.getValue()).booleanValue()) {
                        aVar.N(1415069309);
                        g gVarZ4 = remixBetActivity.z1();
                        boolean zA2 = aVar.A(gVarZ4);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            RemixBetActivity.b bVar3 = new RemixBetActivity.b(0, gVarZ4, g.class, "markTutorialDismissed", "markTutorialDismissed()V", 0);
                            aVar.r(bVar3);
                            objY2 = bVar3;
                        }
                        ss4.b((Function0) ((chp) objY2), aVar, 0);
                        aVar.H();
                    } else {
                        aVar.N(1415165409);
                        aVar.H();
                    }
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    public final g z1() {
        return (g) this.b.getValue();
    }
}
