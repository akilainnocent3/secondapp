package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.sporty.android.core.model.config.tax.TaxConfig;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class eeo extends atl implements View.OnClickListener {
    public TextView A;
    public TextView B;
    public TextView C;
    public TextView D;
    public String E;
    public TaxConfig F = TaxConfig.getDefault();
    public r5b G;
    public beo H;
    public r5b I;
    public ceo J;
    public ee<fqk> K;
    public n4p L;
    public jlo M;
    public s890 N;
    public psm O;
    public jpk P;
    public ji2 Q;
    public boolean R;
    public TextView f;
    public TextView i;
    public a v;
    public View w;
    public TextView y;
    public Group z;

    public interface a {
        void b();

        void d();
    }

    public final void m0() {
        if (isAdded()) {
            Context context = this.y.getContext();
            j7g j7gVar = new j7g("");
            int color = context.getColor(R.color.text_type1_primary);
            int color2 = context.getColor(R.color.brand_secondary);
            if (this.P.p1().getValue().isEmpty() || this.L.C) {
                this.w.setVisibility(8);
            } else {
                j7gVar.e(color, sn5.b(context, R.string.component_coupon__use_gifts_with_num, String.valueOf(this.P.p1().getValue().size())));
                this.w.setVisibility(0);
                this.y.setText(j7gVar);
            }
            m780 m780VarT0 = this.P.t0(this.E);
            o4p o4pVar = this.L.f;
            if (m780VarT0 != null && o4pVar != null) {
                String string = o4pVar.j.toString();
                int kind = m780VarT0.b.getKind();
                String str = m780VarT0.a;
                String strB = m780VarT0.b();
                if (!TextUtils.isEmpty(string) && Double.parseDouble(str) > Double.parseDouble(string)) {
                    str = string;
                }
                String strA = pvf.a(getContext(), kind);
                String strA2 = this.O.B() + " -" + String.format(Locale.US, "%,.2f", Double.valueOf(Double.parseDouble(str)));
                if (!TextUtils.isEmpty(strA)) {
                    strA2 = oxc.a(strA, ", ", strA2);
                }
                j7gVar.clear();
                j7gVar.e(color2, strA2);
                this.y.setText(j7gVar);
                if (kind != 2 || TextUtils.isEmpty(string) || TextUtils.isEmpty(strB) || Double.parseDouble(string) >= Double.parseDouble(strB)) {
                    return;
                }
            }
            if (this.P.p1().getValue().isEmpty() || this.L.C) {
                this.w.setVisibility(8);
            } else {
                String strB2 = sn5.b(context, R.string.component_coupon__use_gifts_with_num, String.valueOf(this.P.p1().getValue().size()));
                j7gVar.clear();
                j7gVar.e(color, strB2);
                this.y.setText(j7gVar);
                this.w.setVisibility(0);
            }
            this.P.E(this.E);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    public final void n0() {
        BigDecimal exciseTax;
        BigDecimal bigDecimalSubtract;
        boolean zHasExciseTaxRate;
        TextView textView;
        o4p o4pVar = this.L.f;
        if (o4pVar == null) {
            dismiss();
            return;
        }
        BigDecimal bigDecimalSubtract2 = BigDecimal.ZERO;
        m780 m780VarT0 = this.P.t0(this.E);
        if (m780VarT0 != null && !this.L.C) {
            BigDecimal bigDecimal = new BigDecimal(m780VarT0.a);
            exciseTax = o4pVar.j.compareTo(bigDecimal) > 0 ? this.F.getExciseTax(o4pVar.j.subtract(bigDecimal)) : bigDecimalSubtract2;
            BigDecimal bigDecimalSubtract3 = o4pVar.j.add(exciseTax).subtract(bigDecimal);
            if (bigDecimalSubtract3.compareTo(bigDecimalSubtract2) < 0) {
                bigDecimalSubtract3 = bigDecimalSubtract2;
            }
            this.f.setText(this.O.N(bigDecimalSubtract3));
            int iCompareTo = o4pVar.j.compareTo(bigDecimal);
            BigDecimal bigDecimal2 = o4pVar.j;
            if (iCompareTo >= 0) {
                bigDecimalSubtract2 = bigDecimal2.subtract(bigDecimal);
            } else {
                bigDecimalSubtract = (bigDecimal2.compareTo(bigDecimal) >= 0 || o4pVar.j.add(exciseTax).compareTo(bigDecimal) <= 0) ? bigDecimalSubtract2 : exciseTax.subtract(bigDecimal.subtract(o4pVar.j));
            }
            zHasExciseTaxRate = this.F.hasExciseTaxRate();
            textView = this.i;
            if (zHasExciseTaxRate) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                this.i.setText(sn5.d(this, R.string.component_betslip__excise_tax_confirm_dialog_bracket, this.O.N(bigDecimalSubtract2), this.O.N(bigDecimalSubtract)));
            }
        }
        bigDecimalSubtract2 = o4pVar.j;
        exciseTax = this.F.getExciseTax(bigDecimalSubtract2);
        this.f.setText(this.O.N(o4pVar.j.add(exciseTax)));
        bigDecimalSubtract = exciseTax;
        zHasExciseTaxRate = this.F.hasExciseTaxRate();
        textView = this.i;
        if (zHasExciseTaxRate) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            this.i.setText(sn5.d(this, R.string.component_betslip__excise_tax_confirm_dialog_bracket, this.O.N(bigDecimalSubtract2), this.O.N(bigDecimalSubtract)));
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (getActivity() == null || getActivity().isFinishing() || this.R) {
            return;
        }
        int id = view.getId();
        if (id == R.id.gifts || id == R.id.gifts_container) {
            n4p n4pVar = this.L;
            o4p o4pVar = n4pVar.f;
            Integer numA = vcj.a(n4pVar.c());
            if (numA == null) {
                return;
            }
            n4p n4pVar2 = this.L;
            InstantWinGiftApplicabilityContext instantWinGiftApplicabilityContextA = sqf0.a(o4pVar, n4pVar2.B, n4pVar2.C, this.Q, null);
            if (instantWinGiftApplicabilityContextA == null) {
                return;
            }
            this.K.b(new fqk(numA.intValue(), instantWinGiftApplicabilityContextA, this.P.t0(this.E)));
            return;
        }
        if (id == R.id.cancel) {
            this.R = true;
            a aVar = this.v;
            if (aVar != null) {
                aVar.d();
                return;
            }
            return;
        }
        if (id == R.id.confirm) {
            this.N.getClass();
            this.R = true;
            a aVar2 = this.v;
            if (aVar2 != null) {
                aVar2.b();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [ceo] */
    /* JADX WARN: Type inference failed for: r3v8, types: [beo] */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            dismiss();
            return;
        }
        this.E = arguments.getString("ARG_BETSLIP_TYPE");
        this.F = (TaxConfig) rj5.a(arguments, "ARG_VIRTUAL_TAX_CONFIG", TaxConfig.class);
        if (this.E == null) {
            dismiss();
            return;
        }
        this.G = i2i.b(this.P.p1());
        this.H = new lfy() { // from class: beo
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                this.a.m0();
            }
        };
        this.I = i2i.b(this.P.G0(this.E));
        this.J = new lfy() { // from class: ceo
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                eeo eeoVar = this.a;
                eeoVar.m0();
                eeoVar.n0();
            }
        };
        this.K = registerForActivityResult(this.M.a(), new ud() { // from class: deo
            @Override // defpackage.ud
            public final void a(Object obj) {
                gqk gqkVar = (gqk) obj;
                boolean z = gqkVar instanceof gqk.c;
                eeo eeoVar = this.a;
                if (z) {
                    eeoVar.P.j1(((gqk.c) gqkVar).a);
                    return;
                }
                if (!(gqkVar instanceof gqk.a)) {
                    if (gqkVar instanceof gqk.d) {
                        eeoVar.P.E(eeoVar.E);
                    }
                } else {
                    gqk.a aVar = (gqk.a) gqkVar;
                    eeoVar.P.I(eeoVar.E, aVar.a, aVar.b);
                }
            }
        });
    }

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        fvh fvhVar;
        Dialog dialog = new Dialog(getActivity(), R.style.BottomDialog);
        dialog.requestWindowFeature(1);
        if (dialog.getWindow() != null) {
            dialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.setContentView(R.layout.iwqk_frag_confirm_dialog);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        window.setWindowAnimations(R.style.AnimBottom);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        this.f = (TextView) dialog.findViewById(R.id.amount);
        this.i = (TextView) dialog.findViewById(R.id.tax_view);
        Button button = (Button) dialog.findViewById(R.id.cancel);
        Button button2 = (Button) dialog.findViewById(R.id.confirm);
        this.z = (Group) dialog.findViewById(R.id.groupItems);
        this.A = (TextView) dialog.findViewById(R.id.flex_bet_options);
        this.B = (TextView) dialog.findViewById(R.id.total_odds);
        this.C = (TextView) dialog.findViewById(R.id.potential_win);
        this.D = (TextView) dialog.findViewById(R.id.potential_win_label);
        boolean zHasExciseTaxRate = this.F.hasExciseTaxRate();
        TextView textView = this.D;
        if (zHasExciseTaxRate) {
            textView.setText(sn5.d(this, R.string.component_betslip__to_win, new Object[0]));
        } else {
            textView.setText(sn5.d(this, R.string.component_betslip__potential_win, new Object[0]));
        }
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        View viewFindViewById = dialog.findViewById(R.id.gifts_container);
        this.w = viewFindViewById;
        g8i0.b(viewFindViewById, this.P.a0() && !this.L.C);
        this.w.setOnClickListener(this);
        this.y = (TextView) dialog.findViewById(R.id.gifts);
        this.y.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, s0b.a(dialog.getContext(), R.drawable.ic_play_arrow_green_24dp, new a78.c(R.color.custom_text_type1_primary_type1)), (Drawable) null);
        this.y.setCompoundDrawablePadding(zch0.a(dialog.getContext(), 5));
        n0();
        if (!SimulateBetConsts.BetslipType.MULTIPLE.equals(this.E) || !this.L.B) {
            this.z.setVisibility(8);
            return dialog;
        }
        this.z.setVisibility(0);
        spi spiVar = this.L.A;
        int i = spiVar.h;
        this.A.setText(String.format("%d+ of %d", Integer.valueOf(i), Integer.valueOf(this.L.f.g)));
        HashMap map = spiVar.f;
        if (map != null && (fvhVar = (fvh) map.get(Integer.valueOf(i))) != null) {
            this.B.setText(gky.a.a(bjb0.L(fvhVar.a, Locale.US), false));
            this.C.setText(fvhVar.c);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.v = null;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStart() {
        ceo ceoVar;
        super.onStart();
        this.G.g(this.H);
        r5b r5bVar = this.I;
        if (r5bVar == null || (ceoVar = this.J) == null) {
            return;
        }
        r5bVar.g(ceoVar);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onStop() {
        ceo ceoVar;
        r5b r5bVar = this.I;
        if (r5bVar != null && (ceoVar = this.J) != null) {
            r5bVar.k(ceoVar);
        }
        this.G.k(this.H);
        super.onStop();
    }
}
