package defpackage;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.calendar.TxCalendarActivity;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$1", f = "TxListActivity.kt", l = {467}, m = "invokeSuspend", v = 2)
public final class a7h0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ TxListActivity b;
    public final /* synthetic */ o7h0 c;

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$1$1", f = "TxListActivity.kt", l = {468}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o7h0 b;
        public final /* synthetic */ TxListActivity c;

        /* JADX INFO: renamed from: a7h0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$1$1$1", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C0008a extends tje0 implements Function2<g5h0, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ TxListActivity b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0008a(TxListActivity txListActivity, v1b<? super C0008a> v1bVar) {
                super(2, v1bVar);
                this.b = txListActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0008a c0008a = new C0008a(this.b, v1bVar);
                c0008a.a = obj;
                return c0008a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(g5h0 g5h0Var, v1b<? super Unit> v1bVar) {
                return ((C0008a) create(g5h0Var, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                g5h0 g5h0Var = (g5h0) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                boolean z = g5h0Var instanceof g5h0.b;
                final TxListActivity txListActivity = this.b;
                if (z) {
                    aqg0 aqg0Var = ((g5h0.b) g5h0Var).a;
                    int i = TxListActivity.K;
                    if (txListActivity.B == null) {
                        int iB = zch0.b(txListActivity.getResources(), 8);
                        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(txListActivity);
                        linearLayoutCompat.setOrientation(1);
                        linearLayoutCompat.setBackgroundColor(0);
                        View view = new View(txListActivity);
                        view.setBackgroundResource(R.color.background_general_primary);
                        view.setLayoutParams(new LinearLayout.LayoutParams(-1, iB));
                        View view2 = new View(txListActivity);
                        view2.setBackgroundResource(R.color.background_general_primary);
                        view2.setLayoutParams(new LinearLayout.LayoutParams(-1, iB));
                        linearLayoutCompat.addView(view);
                        ListIterator listIterator = aqg0.c.a(txListActivity.getCountryManager()).listIterator(0);
                        while (true) {
                            ngs.c cVar = (ngs.c) listIterator;
                            if (cVar.hasNext()) {
                                final aqg0 aqg0Var2 = (aqg0) cVar.next();
                                boolean z2 = aqg0Var2.a == aqg0Var.a;
                                CharSequence charSequenceE = aqg0Var2.b.e(txListActivity);
                                View viewInflate = txListActivity.getLayoutInflater().inflate(R.layout.transaction_type_dropdown_item, (ViewGroup) linearLayoutCompat, false);
                                int i2 = R.id.icon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.icon, viewInflate);
                                if (appCompatImageView != null) {
                                    i2 = R.id.text;
                                    TextView textView = (TextView) h5e.a(R.id.text, viewInflate);
                                    if (textView != null) {
                                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                                        textView.setText(charSequenceE);
                                        linearLayout.setSelected(z2);
                                        appCompatImageView.setVisibility(z2 ? 0 : 8);
                                        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: r6h0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                int i3 = TxListActivity.K;
                                                TxListActivity txListActivity2 = txListActivity;
                                                o7h0 o7h0VarA1 = txListActivity2.A1();
                                                wwd0 wwd0Var = o7h0VarA1.A;
                                                aqg0 aqg0Var3 = ((w0h0) wwd0Var.getValue()).a;
                                                aqg0 aqg0Var4 = aqg0Var2;
                                                if (!aqg0Var4.equals(aqg0Var3)) {
                                                    wwd0Var.k(null, new w0h0(aqg0Var4, aqg0Var4.equals(aqg0.a.c)));
                                                    o7h0VarA1.z1();
                                                }
                                                yec yecVar = txListActivity2.B;
                                                if (yecVar != null) {
                                                    yecVar.dismiss();
                                                }
                                                gym.a(txListActivity2.z1(), new xpg0.d(tj5.a(txListActivity2.getIntent()), aqg0Var4.b.e(txListActivity2).toString()));
                                            }
                                        });
                                        linearLayoutCompat.addView(linearLayout);
                                    }
                                }
                                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
                                return null;
                            }
                            linearLayoutCompat.addView(view2);
                            linearLayoutCompat.setOnTouchListener(new View.OnTouchListener() { // from class: s6h0
                                @Override // android.view.View.OnTouchListener
                                public final boolean onTouch(View view3, MotionEvent motionEvent) {
                                    yec yecVar;
                                    TxListActivity txListActivity2 = txListActivity;
                                    yec yecVar2 = txListActivity2.B;
                                    if (yecVar2 == null || !yecVar2.isShowing() || (yecVar = txListActivity2.B) == null) {
                                        return false;
                                    }
                                    yecVar.dismiss();
                                    return false;
                                }
                            });
                            yec yecVar = new yec((ViewGroup) linearLayoutCompat);
                            View decorView = txListActivity.getWindow().getDecorView();
                            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                            l8j0 l8j0VarA = r6i0.e.a(decorView);
                            if (l8j0VarA != null) {
                                ymn ymnVarG = l8j0VarA.a.g(519);
                                ymnVarG.getClass();
                                yecVar.a = ymnVarG.d;
                            }
                            yecVar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#99000000")));
                            yecVar.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: t6h0
                                @Override // android.widget.PopupWindow.OnDismissListener
                                public final void onDismiss() {
                                    TxListActivity txListActivity2 = txListActivity;
                                    ze zeVar = txListActivity2.d;
                                    if (zeVar == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    zeVar.E.setSelected(false);
                                    txListActivity2.B = null;
                                }
                            });
                            ze zeVar = txListActivity.d;
                            if (zeVar == null) {
                                Intrinsics.n("binding");
                                throw null;
                            }
                            yecVar.showAsDropDown(zeVar.E, 0, 0);
                            yecVar.setOutsideTouchable(true);
                            txListActivity.B = yecVar;
                            break;
                        }
                    }
                } else {
                    if (!(g5h0Var instanceof g5h0.a)) {
                        uhc.a();
                        return null;
                    }
                    g5h0.a aVar = (g5h0.a) g5h0Var;
                    Pair<Long, Long> pair = aVar.a;
                    txListActivity.w.b(new TxCalendarActivity.b(pair.a.longValue(), pair.b.longValue(), aVar.b));
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
                t340 t340Var = this.b.F;
                C0008a c0008a = new C0008a(this.c, null);
                this.a = 1;
                if (kzh.b(t340Var, c0008a, this) == y5bVar) {
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
    public a7h0(v1b v1bVar, o7h0 o7h0Var, TxListActivity txListActivity) {
        super(2, v1bVar);
        this.b = txListActivity;
        this.c = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a7h0(v1bVar, this.c, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a7h0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
