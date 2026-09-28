package defpackage;

import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$2", f = "TxListActivity.kt", l = {492}, m = "invokeSuspend", v = 2)
public final class c7h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ TxListActivity b;
    public final /* synthetic */ o7h0 c;

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$2$1", f = "TxListActivity.kt", l = {493}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o7h0 b;
        public final /* synthetic */ TxListActivity c;

        /* JADX INFO: renamed from: c7h0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$2$1$1", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0156a extends tje0 implements Function2<fex, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ TxListActivity b;
            public final /* synthetic */ o7h0 c;

            /* JADX INFO: renamed from: c7h0$a$a$a, reason: collision with other inner class name */
            public static final class C0157a extends ClickableSpan {
                public final /* synthetic */ o7h0 a;
                public final /* synthetic */ l7l.a b;

                public C0157a(o7h0 o7h0Var, l7l.a aVar) {
                    this.a = o7h0Var;
                    this.b = aVar;
                }

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    view.getClass();
                    this.a.N.a(this.b.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0156a(v1b v1bVar, o7h0 o7h0Var, TxListActivity txListActivity) {
                super(2, v1bVar);
                this.b = txListActivity;
                this.c = o7h0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0156a c0156a = new C0156a(v1bVar, this.c, this.b);
                c0156a.a = obj;
                return c0156a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(fex fexVar, v1b<? super Unit> v1bVar) {
                return ((C0156a) create(fexVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                fex fexVar = (fex) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                zsp zspVar = fexVar.a;
                final TxListActivity txListActivity = this.b;
                txListActivity.H = zspVar;
                m7l m7lVar = fexVar.b;
                if (zspVar.a != zsp.a.a) {
                    boolean zA = atp.a(zspVar);
                    KycSource kycSource = zA ? KycSource.TRANSACTION_RESUBMIT : KycSource.VERIFY;
                    osp.o oVar = zA ? new osp.o(eup.TRANSACTION) : null;
                    if (zA) {
                        eup eupVar = eup.HOME;
                    }
                    if (zA) {
                        eup eupVar2 = eup.HOME;
                    }
                    kycSource.getClass();
                    ze zeVar = txListActivity.d;
                    if (zeVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    wh7 wh7Var = zeVar.D;
                    ConstraintLayout constraintLayout = wh7Var.a;
                    ComposeView composeView = wh7Var.b;
                    constraintLayout.setBackgroundColor(0);
                    constraintLayout.setPadding(0, 0, 0, 0);
                    composeView.setVisibility(0);
                    wh7Var.f.setVisibility(8);
                    wh7Var.d.setVisibility(8);
                    wh7Var.c.setVisibility(8);
                    wh7Var.e.setVisibility(8);
                    if (oVar != null) {
                        o7h0.B1(txListActivity.A1(), oVar, new l6h0(), 2);
                    }
                    ysp.b(new ysp.a() { // from class: m6h0
                        @Override // ysp.a
                        public final void b(zsp zspVar2) {
                            int i = TxListActivity.K;
                            zspVar2.getClass();
                            boolean zA2 = atp.a(zspVar2);
                            KycSource kycSource2 = zA2 ? KycSource.TRANSACTION_RESUBMIT : KycSource.VERIFY;
                            if (zA2) {
                                eup eupVar3 = eup.HOME;
                            }
                            osp.n nVar = zA2 ? new osp.n(eup.TRANSACTION) : null;
                            if (zA2) {
                                eup eupVar4 = eup.HOME;
                            }
                            kycSource2.getClass();
                            TxListActivity txListActivity2 = txListActivity;
                            o7h0.B1(txListActivity2.A1(), new xpg0.l(0), null, 6);
                            if (nVar != null) {
                                o7h0.B1(txListActivity2.A1(), nVar, new lfw(1), 2);
                            }
                            lsp lspVar = txListActivity2.G;
                            if (lspVar == null) {
                                Intrinsics.n("kycEntryNavigator");
                                throw null;
                            }
                            Intent intentB = lspVar.b(txListActivity2, kycSource2, zspVar2);
                            if (intentB != null) {
                                txListActivity2.startActivity(intentB);
                            }
                        }
                    }, new c8(txListActivity), zspVar, composeView);
                    ze zeVar2 = txListActivity.d;
                    if (zeVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar2.D.a.setVisibility(0);
                    ze zeVar3 = txListActivity.d;
                    if (zeVar3 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar3.f.setVisibility(8);
                    txListActivity.B1(txListActivity.I);
                    zsp.a aVar = zspVar.a;
                    if (aVar == zsp.a.e || aVar == zsp.a.f || aVar == zsp.a.b) {
                        o7h0.B1(txListActivity.A1(), new xpg0.m(0), null, 6);
                    }
                    return Unit.a;
                }
                ze zeVar4 = txListActivity.d;
                if (zeVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                ConstraintLayout constraintLayout2 = zeVar4.D.a;
                constraintLayout2.setBackgroundColor(txListActivity.getColor(R.color.warning_tertiary));
                constraintLayout2.setPadding(0, zch0.b(txListActivity.getResources(), 13), zch0.b(txListActivity.getResources(), 4), zch0.b(txListActivity.getResources(), 13));
                ze zeVar5 = txListActivity.d;
                if (zeVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar5.D.b.setVisibility(8);
                ze zeVar6 = txListActivity.d;
                if (zeVar6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar6.D.f.setVisibility(0);
                ze zeVar7 = txListActivity.d;
                if (zeVar7 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar7.D.d.setVisibility(0);
                ze zeVar8 = txListActivity.d;
                if (zeVar8 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar8.D.c.setVisibility(0);
                boolean z = m7lVar instanceof m7l.c;
                ze zeVar9 = txListActivity.d;
                if (z) {
                    if (zeVar9 != null) {
                        zeVar9.D.a.setVisibility(8);
                        return Unit.a;
                    }
                    Intrinsics.n("binding");
                    throw null;
                }
                if (zeVar9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar9.f.setVisibility(8);
                ze zeVar10 = txListActivity.d;
                if (zeVar10 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar10.D.a.setVisibility(0);
                ze zeVar11 = txListActivity.d;
                if (zeVar11 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                TextView textView = zeVar11.D.d;
                CharSequence charSequenceE = m7lVar.getTitle().e(txListActivity);
                if (charSequenceE.length() == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                }
                textView.setText(charSequenceE);
                l7l l7lVarB = m7lVar.b();
                boolean z2 = l7lVarB instanceof l7l.b;
                final o7h0 o7h0Var = this.c;
                if (z2) {
                    ze zeVar12 = txListActivity.d;
                    if (zeVar12 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar12.D.c.setText(((l7l.b) l7lVarB).a.e(txListActivity));
                } else {
                    if (!(l7lVarB instanceof l7l.a)) {
                        uhc.a();
                        return null;
                    }
                    l7l.a aVar2 = (l7l.a) l7lVarB;
                    SpannableStringBuilder spannableStringBuilderJ = zch0.j(aVar2.a.e(txListActivity), txListActivity.getColor(R.color.warning_primary), 12, new C0157a(o7h0Var, aVar2));
                    ze zeVar13 = txListActivity.d;
                    if (zeVar13 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar13.D.c.setMovementMethod(LinkMovementMethod.getInstance());
                    ze zeVar14 = txListActivity.d;
                    if (zeVar14 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar14.D.c.setText(spannableStringBuilderJ);
                }
                i7l i7lVarA = m7lVar.a();
                if (i7lVarA instanceof i7l.b) {
                    ze zeVar15 = txListActivity.d;
                    if (zeVar15 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar15.D.e.setVisibility(8);
                } else {
                    if (!(i7lVarA instanceof i7l.a)) {
                        uhc.a();
                        return null;
                    }
                    ze zeVar16 = txListActivity.d;
                    if (zeVar16 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar16.D.e.setVisibility(0);
                    ze zeVar17 = txListActivity.d;
                    if (zeVar17 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    final i7l.a aVar3 = (i7l.a) i7lVarA;
                    zeVar17.D.e.setText(aVar3.a.e(txListActivity));
                    ze zeVar18 = txListActivity.d;
                    if (zeVar18 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar18.D.e.setOnClickListener(new View.OnClickListener() { // from class: b7h0
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            h7l h7lVar = aVar3.b;
                            h7lVar.getClass();
                            o7h0Var.N.a(h7lVar);
                        }
                    });
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, o7h0 o7h0Var, TxListActivity txListActivity) {
            super(2, v1bVar);
            this.b = o7h0Var;
            this.c = txListActivity;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                o7h0 o7h0Var = this.b;
                v340 v340Var = o7h0Var.P;
                C0156a c0156a = new C0156a(null, o7h0Var, this.c);
                this.a = 1;
                if (kzh.b(v340Var, c0156a, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7h0(v1b v1bVar, o7h0 o7h0Var, TxListActivity txListActivity) {
        super(2, v1bVar);
        this.b = txListActivity;
        this.c = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c7h0(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c7h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s.b bVar = s9s.b.d;
            o7h0 o7h0Var = this.c;
            TxListActivity txListActivity = this.b;
            a aVar = new a(null, o7h0Var, txListActivity);
            this.a = 1;
            if (m850.b(txListActivity, bVar, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
