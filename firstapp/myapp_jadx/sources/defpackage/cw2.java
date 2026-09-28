package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.EarlyPayoutCheckbox;
import com.sportybet.android.widget.OneUpTwoUpCheckbox;
import com.sportybet.android.widget.OneUpTwoUpItemControl;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes7.dex */
public final class cw2 extends c63 {
    public final pgd0 a;
    public final z53 b;

    /* JADX WARN: Illegal instructions before constructor call */
    public cw2(final pgd0 pgd0Var, z53 z53Var) {
        ConstraintLayout constraintLayout = pgd0Var.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.a = pgd0Var;
        this.b = z53Var;
        this.itemView.setOnClickListener(new pv2(this, 0));
        pgd0Var.F.setOnClickListener(new View.OnClickListener() { // from class: tv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cw2 cw2Var = this.a;
                cw2Var.b.invoke(new y43.a.g(cw2Var.getBindingAdapterPosition()));
            }
        });
        KeyboardView keyboardView = pgd0Var.f;
        keyboardView.setOnValueChangeListener(new zv2(this));
        keyboardView.setOnDoneButtonClickListener(new uv2(this, 0));
        EditText editText = pgd0Var.Q;
        editText.setOnClickListener(new View.OnClickListener() { // from class: vv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cw2 cw2Var = this.a;
                cw2Var.b.invoke(new y43.a.l(cw2Var.getBindingAdapterPosition()));
            }
        });
        editText.setOnTouchListener(new View.OnTouchListener() { // from class: wv2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                cw2 cw2Var = this.a;
                cw2Var.b.invoke(new y43.a.m(cw2Var.getBindingAdapterPosition()));
                return false;
            }
        });
        pgd0Var.U.setOnClickListener(new xv2(this, 0));
        pgd0Var.w.setOnClickListener(new View.OnClickListener() { // from class: lv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cw2 cw2Var = this.a;
                cw2Var.b.invoke(new y43.a.f(cw2Var.getBindingAdapterPosition()));
            }
        });
        pgd0Var.i.setOnClickListener(new View.OnClickListener() { // from class: mv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cw2 cw2Var = this.a;
                cw2Var.b.invoke(new y43.a.C1324a(cw2Var.getBindingAdapterPosition(), pgd0Var.i.isChecked()));
            }
        });
        OneUpTwoUpItemControl oneUpTwoUpItemControl = pgd0Var.P;
        oneUpTwoUpItemControl.getSwitchView().setOnStateChangedListener(new yv2(this, pgd0Var));
        oneUpTwoUpItemControl.getCheckBoxView().setCheckBoxListener(new View.OnClickListener(this) { // from class: nv2
            public final /* synthetic */ cw2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zuy zuyVar;
                huy huyVar;
                OneUpTwoUpItemControl oneUpTwoUpItemControl2 = pgd0Var.P;
                OneUpTwoUpCheckbox.a g = oneUpTwoUpItemControl2.getCheckBoxView().getG();
                boolean zIsChecked = oneUpTwoUpItemControl2.getCheckBoxView().F.b.isChecked();
                g.getClass();
                int iOrdinal = g.ordinal();
                if (iOrdinal == 0) {
                    zuyVar = zuy.c;
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    }
                    zuyVar = zuy.d;
                }
                zuy zuyVar2 = zuyVar;
                int iOrdinal2 = g.ordinal();
                if (iOrdinal2 == 0) {
                    huyVar = huy.a;
                } else {
                    if (iOrdinal2 != 1) {
                        uhc.a();
                        return;
                    }
                    huyVar = huy.b;
                }
                huy huyVar2 = huyVar;
                avy avyVarF = hih0.f(g, !zIsChecked);
                avy avyVarF2 = hih0.f(g, zIsChecked);
                cw2 cw2Var = this.b;
                cw2Var.b.invoke(new y43.a.j(cw2Var.getBindingAdapterPosition(), zuyVar2, huyVar2, avyVarF2, avyVarF));
            }
        });
        pgd0Var.y.setCheckBoxListener(new View.OnClickListener(this) { // from class: ov2
            public final /* synthetic */ cw2 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean zIsChecked = pgd0Var.y.a.b.isChecked();
                cw2 cw2Var = this.b;
                cw2Var.b.invoke(new y43.a.b(cw2Var.getBindingAdapterPosition(), zIsChecked));
            }
        });
        for (final EarlyPayoutCheckbox earlyPayoutCheckbox : b.k(pgd0Var.M, pgd0Var.N)) {
            earlyPayoutCheckbox.setCheckBoxListener(new View.OnClickListener() { // from class: qv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean zIsChecked = earlyPayoutCheckbox.a.b.isChecked();
                    cw2 cw2Var = this;
                    cw2Var.b.invoke(new y43.a.i(cw2Var.getBindingAdapterPosition(), zIsChecked));
                }
            });
            earlyPayoutCheckbox.setInfoClickListener(new View.OnClickListener() { // from class: rv2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cw2 cw2Var = this.a;
                    cw2Var.b.invoke(new y43.a.h(cw2Var.getBindingAdapterPosition()));
                }
            });
        }
        pgd0Var.B.setOnClickListener(new View.OnClickListener() { // from class: sv2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cw2 cw2Var = this.a;
                cw2Var.b.invoke(new y43.a.d(cw2Var.getBindingAdapterPosition()));
            }
        });
    }

    public static final void a(cw2 cw2Var) {
        cw2Var.b.invoke(new y43.a.k(cw2Var.getBindingAdapterPosition(), cw2Var.a.Q.getText().toString()));
    }

    public static void b(EarlyPayoutCheckbox earlyPayoutCheckbox, apx.a aVar, boolean z) {
        earlyPayoutCheckbox.setVisibility(0);
        earlyPayoutCheckbox.setDashViewVisible(!z && aVar.c);
        earlyPayoutCheckbox.setVerticalDividerVisible(!z && aVar.d);
        earlyPayoutCheckbox.setInfoVisible(true);
        earlyPayoutCheckbox.setCheckBoxVisible(true);
        earlyPayoutCheckbox.setChecked(aVar.a);
        EarlyPayoutCheckbox.setLoading$default(earlyPayoutCheckbox, aVar.b, false, 2, null);
        Context context = earlyPayoutCheckbox.getContext();
        context.getClass();
        earlyPayoutCheckbox.setDescription(sn5.b(context, R.string.common_bet_ways__never_down, new Object[0]));
    }

    public static void c(EarlyPayoutCheckbox earlyPayoutCheckbox) {
        earlyPayoutCheckbox.setVisibility(8);
        EarlyPayoutCheckbox.setLoading$default(earlyPayoutCheckbox, false, false, 2, null);
        earlyPayoutCheckbox.setInfoVisible(false);
        earlyPayoutCheckbox.setDashViewVisible(false);
        earlyPayoutCheckbox.setVerticalDividerVisible(false);
    }

    public static void d(TextView textView, Context context, int i, Integer num) {
        Drawable drawableMutate;
        int iB = zch0.b(context.getResources(), 16);
        Drawable drawableA = gr0.a(context, i);
        if (drawableA == null || (drawableMutate = drawableA.mutate()) == null) {
            drawableMutate = null;
        } else {
            if (num != null) {
                drawableMutate.setTint(num.intValue());
            }
            drawableMutate.setBounds(0, 0, iB, iB);
        }
        textView.setCompoundDrawablesRelative(drawableMutate, null, null, null);
    }
}
