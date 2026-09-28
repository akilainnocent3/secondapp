package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.EarlyPayoutCheckbox;
import com.sportybet.android.widget.OneUpTwoUpCheckbox;
import com.sportybet.android.widget.OneUpTwoUpItemControl;
import com.sportybet.android.widget.OneUpTwoUpSwitch;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.betslip.virtualkeyboard.KeyboardView;
import com.sportybet.plugin.realsports.widget.DancingNumber;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class b63 extends x<z43, c63> {
    public static final a e = new a();
    public xf3 b;
    public y8k c;
    public p8k d;

    public static final class a extends n.e<z43> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(z43 z43Var, z43 z43Var2) {
            z43 z43Var3 = z43Var;
            z43 z43Var4 = z43Var2;
            z43Var3.getClass();
            z43Var4.getClass();
            return Intrinsics.g(z43Var3, z43Var4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(z43 z43Var, z43 z43Var2) {
            Object bVar;
            Object bVar2;
            z43 z43Var3 = z43Var;
            z43 z43Var4 = z43Var2;
            z43Var3.getClass();
            z43Var4.getClass();
            if (!(z43Var3 instanceof z43.a) || !(z43Var4 instanceof z43.a)) {
                try {
                    zi50.a aVar = zi50.b;
                    bVar = Boolean.valueOf(Intrinsics.g(z43Var3.getId(), z43Var4.getId()));
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (zi50.a(bVar) != null) {
                    bVar = Boolean.FALSE;
                }
                return ((Boolean) bVar).booleanValue();
            }
            try {
                zi50.a aVar3 = zi50.b;
                Selection selection = ((z43.a) z43Var3).b;
                selection.getClass();
                Selection selection2 = ((z43.a) z43Var4).b;
                selection2.getClass();
                bVar2 = Boolean.valueOf(g880.w(selection, selection2));
            } catch (Throwable th2) {
                zi50.a aVar4 = zi50.b;
                bVar2 = new zi50.b(th2);
            }
            if (zi50.a(bVar2) != null) {
                bVar2 = Boolean.FALSE;
            }
            return ((Boolean) bVar2).booleanValue();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        z43 item = getItem(i);
        if (item instanceof z43.a) {
            return 1;
        }
        if (item instanceof z43.c) {
            return 2;
        }
        if (item instanceof z43.b) {
            return 3;
        }
        uhc.a();
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0512  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38, types: [android.view.View, android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r4v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View, com.sportybet.android.widget.EarlyPayoutCheckbox] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ?? r11;
        TextView textView;
        ?? r4;
        ?? r5;
        TextView textView2;
        int i2;
        c63 c63Var = (c63) d0Var;
        c63Var.getClass();
        c63Var.itemView.setTranslationX(0.0f);
        c63Var.itemView.setTranslationY(0.0f);
        c63Var.itemView.setAlpha(1.0f);
        z43 item = getItem(i);
        boolean z = item instanceof z43.a;
        Class cls = Boolean.TYPE;
        if (!z) {
            if (item instanceof z43.c) {
                xc3 xc3Var = (xc3) c63Var;
                z43.c cVar = (z43.c) item;
                qhd0 qhd0Var = xc3Var.a;
                LinearLayout linearLayout = qhd0Var.a;
                final EditText editText = qhd0Var.d;
                TextView textView3 = qhd0Var.b;
                Context context = linearLayout.getContext();
                qhd0Var.f.setText(a8b.e());
                TextView textView4 = qhd0Var.v;
                StringUiText stringUiText = cVar.d;
                boolean z2 = cVar.h;
                context.getClass();
                textView4.setText(stringUiText.a);
                TextView textView5 = qhd0Var.i;
                UiText uiText = cVar.e;
                uiText.getClass();
                textView5.setText(uiText.e(context).toString());
                InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(xc3Var.d.a().toPlainString().length());
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                editText.setFilters(new InputFilter[]{lengthFilter, new rrh0()});
                Context context2 = editText.getContext();
                context2.getClass();
                editText.setHint(sn5.b(context2, R.string.component_betslip__min_vstake, b6y.b(xc3Var.c.a())));
                editText.setCursorVisible(false);
                editText.setLongClickable(false);
                editText.setTextIsSelectable(false);
                editText.setImeOptions(268435456);
                try {
                    Method method = EditText.class.getMethod("setShowSoftInputOnFocus", cls);
                    method.setAccessible(true);
                    Boolean bool = Boolean.FALSE;
                    method.invoke(editText, bool);
                    Method method2 = EditText.class.getMethod("setSoftInputShownOnFocus", cls);
                    method2.setAccessible(true);
                    method2.invoke(editText, bool);
                } catch (Exception unused) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_BET_SLIP);
                    aVar.n("Reflect EditText.setShowSoftInputOnFocus() failed.", new Object[0]);
                }
                editText.setCustomSelectionActionModeCallback(new wc3());
                UiText uiText2 = cVar.f;
                Context context3 = editText.getContext();
                context3.getClass();
                uiText2.getClass();
                String string = uiText2.e(context3).toString();
                if (!Intrinsics.g(string, editText.getText().toString())) {
                    editText.setText(string);
                }
                editText.post(new Runnable() { // from class: pc3
                    @Override // java.lang.Runnable
                    public final void run() {
                        EditText editText2 = editText;
                        editText2.setSelection(editText2.getText().length());
                    }
                });
                CharSequence charSequenceE = cVar.g.e(context);
                if (charSequenceE.length() > 0) {
                    textView3.setText(charSequenceE);
                    textView3.setVisibility(0);
                    editText.setActivated(z2);
                } else {
                    textView3.setVisibility(8);
                    editText.setActivated(false);
                }
                textView3.setTextColor(context.getColor(z2 ? R.color.warning_primary : R.color.text_disable_type1_primary));
                c8i0.o(qhd0Var.e, cVar.j);
                boolean z3 = cVar.i;
                KeyboardView keyboardView = qhd0Var.c;
                if (z3) {
                    keyboardView.L(editText, cVar.c);
                    editText.requestFocus();
                    editText.setCursorVisible(true);
                    return;
                } else {
                    keyboardView.E();
                    editText.clearFocus();
                    editText.setCursorVisible(false);
                    return;
                }
            }
            return;
        }
        pgd0 pgd0Var = ((cw2) c63Var).a;
        z43.a aVar2 = (z43.a) item;
        boolean z4 = aVar2.C;
        String str = aVar2.h;
        boolean z5 = aVar2.d;
        ConstraintLayout constraintLayout = pgd0Var.a;
        ToggleButton toggleButton = pgd0Var.i;
        final EditText editText2 = pgd0Var.Q;
        LinearLayout linearLayout2 = pgd0Var.K;
        TextView textView6 = pgd0Var.b;
        TextView textView7 = pgd0Var.R;
        DancingNumber dancingNumber = pgd0Var.z;
        TextView textView8 = pgd0Var.D;
        EarlyPayoutCheckbox earlyPayoutCheckbox = pgd0Var.N;
        EarlyPayoutCheckbox earlyPayoutCheckbox2 = pgd0Var.M;
        TextView textView9 = pgd0Var.T;
        View view = pgd0Var.w;
        AppCompatImageView appCompatImageView = pgd0Var.S;
        TextView textView10 = pgd0Var.C;
        TextView textView11 = pgd0Var.J;
        TextView textView12 = pgd0Var.I;
        TextView textView13 = pgd0Var.L;
        OneUpTwoUpItemControl oneUpTwoUpItemControl = pgd0Var.P;
        ?? r8 = pgd0Var.y;
        Context context4 = constraintLayout.getContext();
        boolean z6 = aVar2.A;
        int color = context4.getColor(z5 ? R.color.text_disable_type1_primary : R.color.text_type1_tertiary);
        int i3 = z5 ? 16 : 1;
        pgd0Var.G.setBackgroundResource(aVar2.c);
        int iOrdinal = aVar2.f.ordinal();
        if (iOrdinal == 0) {
            appCompatImageView.setImageDrawable(iwh0.a(context4, R.drawable.spr_ic_close_black_24dp, context4.getColor(R.color.text_type1_primary)));
            view.setVisibility(0);
        } else if (iOrdinal == 1) {
            appCompatImageView.setImageDrawable(iwh0.a(context4, R.drawable.edit_bet_settled, context4.getColor(R.color.brand_secondary)));
            view.setVisibility(0);
        } else if (iOrdinal != 2) {
            uhc.a();
            return;
        } else {
            appCompatImageView.setImageDrawable(iwh0.a(context4, R.drawable.spr_ic_close_black_24dp, context4.getColor(R.color.text_type1_primary)));
            view.setVisibility(4);
        }
        pgd0Var.e.setBackgroundColor(aVar2.e);
        textView13.setCompoundDrawableTintList(ColorStateList.valueOf(color));
        if (aVar2.O) {
            textView13.setCompoundDrawablesRelativeWithIntrinsicBounds(gr0.a(context4, R.drawable.ic_joker_20dp), (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (str != null) {
            m9n m9nVarA = qw90.a(context4);
            nan.a aVar3 = new nan.a(context4);
            aVar3.c = str;
            aVar3.m = wr5.c;
            aVar3.e(bqe.a(20.0f));
            aVar3.d = new aw2(context4, pgd0Var);
            m9nVarA.a(aVar3.a());
        } else {
            textView13.setCompoundDrawablesRelativeWithIntrinsicBounds(gr0.a(context4, R.drawable.ic_sport_default), (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView13.setCompoundDrawablePadding(zch0.b(context4.getResources(), 10));
        textView13.setTextColor(color);
        textView13.setPaintFlags(i3);
        textView13.setText(aVar2.i.e(context4));
        pgd0Var.H.setVisibility(aVar2.j ? 0 : 8);
        pgd0Var.A.setText(aVar2.k.e(context4));
        textView9.setTextColor(color);
        textView9.setPaintFlags(i3);
        textView9.setText(aVar2.l.e(context4));
        textView12.setTextColor(color);
        textView12.setMaxLines(aVar2.n);
        textView12.setPaintFlags(i3);
        textView12.setText(aVar2.m.e(context4));
        pgd0Var.c.setVisibility(aVar2.o ? 0 : 8);
        pgd0Var.E.setVisibility((!aVar2.p || z4) ? 8 : 0);
        pgd0Var.v.a.setVisibility(aVar2.q ? 0 : 8);
        yuy yuyVar = aVar2.r;
        if (yuyVar instanceof yuy.c) {
            OneUpTwoUpSwitch switchView = oneUpTwoUpItemControl.getSwitchView();
            yuy.c cVar2 = (yuy.c) yuyVar;
            boolean z7 = cVar2.c;
            OneUpTwoUpSwitch.c cVar3 = cVar2.a;
            switchView.setMode(cVar3);
            oneUpTwoUpItemControl.getSwitchView().setState(cVar2.b, false, true);
            int iOrdinal2 = cVar2.f.ordinal();
            if (iOrdinal2 == 0) {
                oneUpTwoUpItemControl.getSwitchView().setActivate(false);
            } else if (iOrdinal2 == 1) {
                oneUpTwoUpItemControl.getSwitchView().setActivate(true);
            } else if (iOrdinal2 != 2) {
                uhc.a();
                return;
            }
            oneUpTwoUpItemControl.getSwitchView().setActivate(cVar2.e);
            oneUpTwoUpItemControl.setSupported(z7, cVar3, cVar2.g);
            oneUpTwoUpItemControl.setSwitchVisible(cVar2.d && z7);
            oneUpTwoUpItemControl.setDashViewVisible(cVar2.i);
            r11 = 0;
            oneUpTwoUpItemControl.setCheckBoxVisible(false);
            oneUpTwoUpItemControl.setVisibility(0);
        } else if (yuyVar instanceof yuy.b) {
            OneUpTwoUpCheckbox checkBoxView = oneUpTwoUpItemControl.getCheckBoxView();
            yuy.b bVar = (yuy.b) yuyVar;
            boolean z8 = bVar.g;
            boolean z9 = bVar.c;
            OneUpTwoUpCheckbox.a aVar4 = bVar.a;
            checkBoxView.setMode(aVar4);
            oneUpTwoUpItemControl.getCheckBoxView().setChecked(bVar.b);
            oneUpTwoUpItemControl.getCheckBoxView().setEnable(bVar.e);
            oneUpTwoUpItemControl.setSupported(z9, aVar4, z8);
            int iOrdinal3 = bVar.f.ordinal();
            if (iOrdinal3 == 0) {
                oneUpTwoUpItemControl.getCheckBoxView().F();
            } else if (iOrdinal3 == 1) {
                oneUpTwoUpItemControl.getCheckBoxView().E();
            } else if (iOrdinal3 != 2) {
                uhc.a();
                return;
            }
            r11 = 0;
            if (!z9) {
                oneUpTwoUpItemControl.setSupported(false, aVar4, z8);
            }
            oneUpTwoUpItemControl.setCheckBoxVisible(bVar.d);
            oneUpTwoUpItemControl.setDashViewVisible(bVar.i);
            oneUpTwoUpItemControl.setSwitchVisible(false);
            oneUpTwoUpItemControl.setVisibility(0);
        } else {
            r11 = 0;
            oneUpTwoUpItemControl.setSwitchVisible(false);
            oneUpTwoUpItemControl.setCheckBoxVisible(false);
            oneUpTwoUpItemControl.setDashViewVisible(false);
            oneUpTwoUpItemControl.setVisibility(8);
        }
        okf okfVar = aVar2.s;
        if (okfVar instanceof okf.a) {
            r8.setVisibility(r11);
            EarlyPayoutCheckbox.setLoading$default(r8, r11, r11, 2, null);
            r8.setCheckBoxVisible(true);
            r8.setChecked(true);
            okf.a aVar5 = (okf.a) okfVar;
            boolean z10 = aVar5.c;
            r8.setDashViewVisible(!z10);
            textView12.setVisibility(!z10 ? 0 : 8);
            r8.setDescription(dby.a(context4, aVar5.a, aVar5.b));
        } else if (okfVar instanceof okf.e) {
            r8.setVisibility(0);
            EarlyPayoutCheckbox.setLoading$default(r8, false, false, 2, null);
            r8.setCheckBoxVisible(true);
            r8.setChecked(false);
            okf.e eVar = (okf.e) okfVar;
            boolean z11 = eVar.c;
            r8.setDashViewVisible(!z11);
            textView12.setVisibility(!z11 ? 0 : 8);
            r8.setDescription(dby.a(context4, eVar.a, eVar.b));
        } else if (okfVar instanceof okf.c) {
            r8.setVisibility(0);
            EarlyPayoutCheckbox.setLoading$default(r8, false, false, 2, null);
            r8.setCheckBoxVisible(false);
            r8.setChecked(false);
            boolean z12 = ((okf.c) okfVar).a;
            r8.setDashViewVisible(!z12);
            textView12.setVisibility(!z12 ? 0 : 8);
            r8.setDescription(sn5.b(context4, R.string.component_betslip__early_goals_not_supported, new Object[0]));
        } else if (okfVar instanceof okf.b) {
            r8.setVisibility(0);
            EarlyPayoutCheckbox.setLoading$default(r8, true, false, 2, null);
            r8.setCheckBoxVisible(true);
            okf.b bVar2 = (okf.b) okfVar;
            r8.setChecked(bVar2.d);
            r8.setDescription(dby.a(context4, bVar2.a, bVar2.b));
            r8.setDashViewVisible(!bVar2.c);
        } else if (!Intrinsics.g(okfVar, okf.d.a)) {
            uhc.a();
            return;
        } else {
            r8.setVisibility(8);
            EarlyPayoutCheckbox.setLoading$default(r8, false, false, 2, null);
        }
        apx apxVar = aVar2.t;
        if (Intrinsics.g(apxVar, apx.b.a)) {
            cw2.c(earlyPayoutCheckbox2);
            cw2.c(earlyPayoutCheckbox);
        } else {
            if (!(apxVar instanceof apx.a)) {
                uhc.a();
                return;
            }
            apx.a aVar6 = (apx.a) apxVar;
            if (aVar6.e) {
                cw2.c(earlyPayoutCheckbox2);
                cw2.b(earlyPayoutCheckbox, aVar6, true);
            } else {
                cw2.c(earlyPayoutCheckbox);
                cw2.b(earlyPayoutCheckbox2, aVar6, false);
            }
        }
        pgd0Var.O.setVisibility(aVar2.u ? 0 : 8);
        CharSequence charSequenceE2 = aVar2.v.e(context4);
        CharSequence charSequenceE3 = aVar2.x.e(context4);
        textView8.setPaintFlags(16);
        if (StringsKt.U(charSequenceE2) || z6) {
            textView = textView11;
            linearLayout2.setVisibility(8);
        } else {
            textView = textView11;
            textView.setText(charSequenceE2);
            if (StringsKt.U(charSequenceE3)) {
                i2 = 0;
                textView8.setVisibility(8);
            } else {
                textView8.setText(charSequenceE3);
                i2 = 0;
                textView8.setVisibility(0);
            }
            linearLayout2.setVisibility(i2);
        }
        int iOrdinal4 = aVar2.w.ordinal();
        if (iOrdinal4 == 0) {
            cw2.d(textView, context4, R.drawable.spr_ic_arrow_upward_black_24dp, Integer.valueOf(context4.getColor(R.color.brand_secondary)));
            textView.setCompoundDrawablePadding(zch0.b(context4.getResources(), 8));
        } else if (iOrdinal4 == 1) {
            cw2.d(textView, context4, R.drawable.spr_ic_arrow_downward_black_24dp, Integer.valueOf(context4.getColor(R.color.warning_primary)));
            textView.setCompoundDrawablePadding(zch0.b(context4.getResources(), 8));
        } else if (iOrdinal4 != 2) {
            uhc.a();
            return;
        } else if (aVar2.y) {
            cw2.d(textView, context4, R.drawable.ic_feature_1x2_boost, null);
            textView.setCompoundDrawablePadding(zch0.b(context4.getResources(), 4));
        } else {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        textView10.setText(charSequenceE2);
        textView10.setPaintFlags(16);
        pgd0Var.d.setVisibility(z6 != 0 ? 0 : 8);
        if (z6 != 0) {
            try {
                zi50.a aVar7 = zi50.b;
                float f = Float.parseFloat(aVar2.z.e(context4).toString());
                r4 = aVar2.B;
                try {
                    if (r4 != 0) {
                        DancingNumber dancingNumber2 = dancingNumber;
                        dancingNumber2.g(f);
                        r4 = dancingNumber2;
                    } else {
                        DancingNumber dancingNumber3 = dancingNumber;
                        dancingNumber3.setText(String.format("%1$01.2f", Float.valueOf(f)));
                        r4 = dancingNumber3;
                    }
                    Unit unit = Unit.a;
                    r5 = r4;
                } catch (Throwable unused2) {
                    zi50.a aVar8 = zi50.b;
                    r5 = r4;
                }
            } catch (Throwable unused3) {
                r4 = dancingNumber;
            }
            if (z4) {
                Drawable drawable = context4.getDrawable(R.drawable.ic_flash_boost);
                int dimensionPixelSize = context4.getResources().getDimensionPixelSize(R.dimen.flash_boost_badge_size);
                if (drawable != null) {
                    drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                }
                ViewGroup.LayoutParams layoutParams = textView7.getLayoutParams();
                if (layoutParams == null) {
                    bmy.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.topMargin = bqe.a(2.0f);
                textView2 = textView7;
                textView2.setLayoutParams(marginLayoutParams);
                textView10.setCompoundDrawablesRelative(drawable, null, null, null);
                textView10.setCompoundDrawablePadding(context4.getResources().getDimensionPixelSize(R.dimen.flash_boost_badge_padding));
                r5.setBackground(null);
                r5.setTextColor(context4.getColor(R.color.text_primary));
            } else {
                textView2 = textView7;
            }
        } else {
            textView2 = textView7;
        }
        CharSequence charSequenceE4 = aVar2.F.e(context4);
        textView2.setText(charSequenceE4);
        textView2.setVisibility(!StringsKt.U(charSequenceE4) ? 0 : 8);
        toggleButton.setVisibility(aVar2.D ? 0 : 8);
        toggleButton.setChecked(aVar2.E);
        boolean z13 = aVar2.G;
        String str2 = aVar2.J;
        editText2.setVisibility(z13 ? 0 : 8);
        InputFilter.LengthFilter lengthFilter2 = new InputFilter.LengthFilter(aVar2.I);
        AccountHelperEntryPointImpl accountHelperEntryPointImpl2 = yrh0.a;
        editText2.setFilters(new InputFilter[]{lengthFilter2, new rrh0()});
        UiText uiText3 = aVar2.H;
        Context context5 = editText2.getContext();
        context5.getClass();
        editText2.setHint(uiText3.e(context5));
        editText2.setCursorVisible(false);
        editText2.setLongClickable(false);
        editText2.setTextIsSelectable(false);
        editText2.setImeOptions(268435456);
        try {
            Method method3 = EditText.class.getMethod("setShowSoftInputOnFocus", cls);
            method3.setAccessible(true);
            Boolean bool2 = Boolean.FALSE;
            method3.invoke(editText2, bool2);
            Method method4 = EditText.class.getMethod("setSoftInputShownOnFocus", cls);
            method4.setAccessible(true);
            method4.invoke(editText2, bool2);
        } catch (Exception unused4) {
            itf0.a aVar9 = itf0.a;
            aVar9.q(MyLog.TAG_BET_SLIP);
            aVar9.n("Reflect EditText.setShowSoftInputOnFocus() failed.", new Object[0]);
        }
        editText2.setCustomSelectionActionModeCallback(new bw2());
        if (!Intrinsics.g(str2, editText2.getText().toString())) {
            editText2.setText(str2);
        }
        editText2.post(new Runnable() { // from class: kv2
            @Override // java.lang.Runnable
            public final void run() {
                EditText editText3 = editText2;
                editText3.setSelection(editText3.getText().length());
            }
        });
        pgd0Var.U.setVisibility(aVar2.N ? 0 : 8);
        textView6.setTextColor(context4.getColor(R.color.warning_primary));
        CharSequence charSequenceE5 = aVar2.K.e(context4);
        if (charSequenceE5.length() > 0) {
            textView6.setText(charSequenceE5);
            textView6.setVisibility(0);
            editText2.setActivated(true);
        } else {
            textView6.setVisibility(8);
            editText2.setActivated(false);
        }
        c8i0.o(pgd0Var.B, aVar2.L);
        boolean z14 = aVar2.M;
        KeyboardView keyboardView2 = pgd0Var.f;
        if (z14) {
            keyboardView2.L(editText2, 2);
            editText2.requestFocus();
            editText2.setCursorVisible(true);
        } else {
            keyboardView2.E();
            editText2.clearFocus();
            editText2.setCursorVisible(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x02db A[PHI: r3
      0x02db: PHI (r3v4 int) = 
      (r3v3 int)
      (r3v5 int)
      (r3v6 int)
      (r3v8 int)
      (r3v9 int)
      (r3v10 int)
      (r3v11 int)
      (r3v12 int)
      (r3v13 int)
      (r3v14 int)
     binds: [B:64:0x0153, B:66:0x015f, B:68:0x0168, B:72:0x017f, B:74:0x0188, B:76:0x0195, B:78:0x01a2, B:80:0x01af, B:82:0x01ba, B:84:0x01c7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[PHI: r3
      0x0122: PHI (r3v38 int) = (r3v37 int), (r3v40 int), (r3v41 int), (r3v42 int) binds: [B:23:0x007f, B:27:0x0094, B:29:0x009f, B:31:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        int i2 = R.id.go_to_deposit_btn;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    View viewInflate = layoutInflaterFrom.inflate(R.layout.spr_betslip_list_mutexnote, viewGroup, false);
                    if (viewInflate != null) {
                        return new pw2((FrameLayout) viewInflate);
                    }
                    bmy.a("rootView");
                    return null;
                }
                eub.a("ViewAdapter viewHolder return null,type:" + i);
                View viewA = dzc.a(viewGroup, R.layout.blank_view_container, viewGroup, false);
                if (viewA != null) {
                    return new df4((ConstraintLayout) viewA);
                }
                bmy.a("rootView");
                return null;
            }
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.spr_edittext_keyboard, viewGroup, false);
            TextView textView = (TextView) h5e.a(R.id.additional_msg, viewInflate2);
            if (textView != null) {
                int i3 = R.id.checkbox_gift;
                if (((CheckBox) h5e.a(R.id.checkbox_gift, viewInflate2)) == null) {
                    i2 = i3;
                } else {
                    KeyboardView keyboardView = (KeyboardView) h5e.a(R.id.custom_number_keyboard, viewInflate2);
                    if (keyboardView != null) {
                        i3 = R.id.edit_text_ksh;
                        EditText editText = (EditText) h5e.a(R.id.edit_text_ksh, viewInflate2);
                        if (editText != null) {
                            i3 = R.id.gift_layout;
                            if (((LinearLayout) h5e.a(R.id.gift_layout, viewInflate2)) != null) {
                                i3 = R.id.gift_progress_bar;
                                if (((ProgressBar) h5e.a(R.id.gift_progress_bar, viewInflate2)) != null) {
                                    TextView textView2 = (TextView) h5e.a(R.id.go_to_deposit_btn, viewInflate2);
                                    if (textView2 != null) {
                                        i2 = R.id.input_area_start_guideline;
                                        if (((Guideline) h5e.a(R.id.input_area_start_guideline, viewInflate2)) != null) {
                                            i2 = R.id.ksh_text;
                                            TextView textView3 = (TextView) h5e.a(R.id.ksh_text, viewInflate2);
                                            if (textView3 != null) {
                                                i2 = R.id.match_number;
                                                TextView textView4 = (TextView) h5e.a(R.id.match_number, viewInflate2);
                                                if (textView4 != null) {
                                                    i2 = R.id.match_number_end_guideline;
                                                    if (((Guideline) h5e.a(R.id.match_number_end_guideline, viewInflate2)) != null) {
                                                        i2 = R.id.stake;
                                                        TextView textView5 = (TextView) h5e.a(R.id.stake, viewInflate2);
                                                        if (textView5 != null) {
                                                            i2 = R.id.tv_gift;
                                                            if (((TextView) h5e.a(R.id.tv_gift, viewInflate2)) != null) {
                                                                qhd0 qhd0Var = new qhd0((LinearLayout) viewInflate2, textView, keyboardView, editText, textView2, textView3, textView4, textView5);
                                                                a63 a63Var = new a63(this);
                                                                y8k y8kVar = this.c;
                                                                if (y8kVar == null) {
                                                                    Intrinsics.n("getMinStakeUseCase");
                                                                    throw null;
                                                                }
                                                                p8k p8kVar = this.d;
                                                                if (p8kVar != null) {
                                                                    return new xc3(qhd0Var, a63Var, y8kVar, p8kVar);
                                                                }
                                                                Intrinsics.n("getMaxStakeUseCase");
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i2 = i3;
                                }
                            } else {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                    } else {
                        i2 = R.id.custom_number_keyboard;
                    }
                }
            } else {
                i2 = R.id.additional_msg;
            }
            bmy.a("Missing required view with ID: ".concat(viewInflate2.getResources().getResourceName(i2)));
            return null;
        }
        View viewInflate3 = layoutInflaterFrom.inflate(R.layout.spr_betslip_list_item, viewGroup, false);
        TextView textView6 = (TextView) h5e.a(R.id.additional_msg, viewInflate3);
        if (textView6 != null) {
            int i4 = R.id.betslip_bore_draw_icon;
            ImageView imageView = (ImageView) h5e.a(R.id.betslip_bore_draw_icon, viewInflate3);
            if (imageView != null) {
                i4 = R.id.boost_odds_container;
                LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.boost_odds_container, viewInflate3);
                if (linearLayout != null) {
                    i4 = R.id.color_mutex;
                    View viewA2 = h5e.a(R.id.color_mutex, viewInflate3);
                    if (viewA2 == null) {
                        i2 = i4;
                    } else {
                        KeyboardView keyboardView2 = (KeyboardView) h5e.a(R.id.custom_number_keyboard, viewInflate3);
                        if (keyboardView2 != null) {
                            i4 = R.id.dan_btn;
                            ToggleButton toggleButton = (ToggleButton) h5e.a(R.id.dan_btn, viewInflate3);
                            if (toggleButton != null) {
                                i4 = R.id.delay_info_hint;
                                View viewA3 = h5e.a(R.id.delay_info_hint, viewInflate3);
                                if (viewA3 != null) {
                                    phd0 phd0VarA = phd0.a(viewA3);
                                    i4 = R.id.delete;
                                    View viewA4 = h5e.a(R.id.delete, viewInflate3);
                                    if (viewA4 != null) {
                                        i4 = R.id.early_payout_item_control;
                                        EarlyPayoutCheckbox earlyPayoutCheckbox = (EarlyPayoutCheckbox) h5e.a(R.id.early_payout_item_control, viewInflate3);
                                        if (earlyPayoutCheckbox != null) {
                                            i4 = R.id.flash_odds;
                                            DancingNumber dancingNumber = (DancingNumber) h5e.a(R.id.flash_odds, viewInflate3);
                                            if (dancingNumber != null) {
                                                i4 = R.id.flow_layout;
                                                if (((Flow) h5e.a(R.id.flow_layout, viewInflate3)) != null) {
                                                    i4 = R.id.game_id;
                                                    TextView textView7 = (TextView) h5e.a(R.id.game_id, viewInflate3);
                                                    if (textView7 != null) {
                                                        TextView textView8 = (TextView) h5e.a(R.id.go_to_deposit_btn, viewInflate3);
                                                        if (textView8 != null) {
                                                            i2 = R.id.init_boost_odds;
                                                            TextView textView9 = (TextView) h5e.a(R.id.init_boost_odds, viewInflate3);
                                                            if (textView9 != null) {
                                                                i2 = R.id.init_match_odds;
                                                                TextView textView10 = (TextView) h5e.a(R.id.init_match_odds, viewInflate3);
                                                                if (textView10 != null) {
                                                                    i2 = R.id.item_odds_boost;
                                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.item_odds_boost, viewInflate3);
                                                                    if (imageView2 != null) {
                                                                        i2 = R.id.item_part;
                                                                        LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.item_part, viewInflate3);
                                                                        if (linearLayout2 != null) {
                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate3;
                                                                            i2 = R.id.live;
                                                                            TextView textView11 = (TextView) h5e.a(R.id.live, viewInflate3);
                                                                            if (textView11 != null) {
                                                                                i2 = R.id.market_desc;
                                                                                TextView textView12 = (TextView) h5e.a(R.id.market_desc, viewInflate3);
                                                                                if (textView12 != null) {
                                                                                    i2 = R.id.match_odds;
                                                                                    TextView textView13 = (TextView) h5e.a(R.id.match_odds, viewInflate3);
                                                                                    if (textView13 != null) {
                                                                                        i2 = R.id.match_odds_container;
                                                                                        LinearLayout linearLayout3 = (LinearLayout) h5e.a(R.id.match_odds_container, viewInflate3);
                                                                                        if (linearLayout3 != null) {
                                                                                            i2 = R.id.match_outcome_desc;
                                                                                            TextView textView14 = (TextView) h5e.a(R.id.match_outcome_desc, viewInflate3);
                                                                                            if (textView14 != null) {
                                                                                                i2 = R.id.never_down_item_control;
                                                                                                EarlyPayoutCheckbox earlyPayoutCheckbox2 = (EarlyPayoutCheckbox) h5e.a(R.id.never_down_item_control, viewInflate3);
                                                                                                if (earlyPayoutCheckbox2 != null) {
                                                                                                    i2 = R.id.never_down_item_control_below;
                                                                                                    EarlyPayoutCheckbox earlyPayoutCheckbox3 = (EarlyPayoutCheckbox) h5e.a(R.id.never_down_item_control_below, viewInflate3);
                                                                                                    if (earlyPayoutCheckbox3 != null) {
                                                                                                        i2 = R.id.odds_container;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.odds_container, viewInflate3);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i2 = R.id.one_two_up_item_control;
                                                                                                            OneUpTwoUpItemControl oneUpTwoUpItemControl = (OneUpTwoUpItemControl) h5e.a(R.id.one_two_up_item_control, viewInflate3);
                                                                                                            if (oneUpTwoUpItemControl != null) {
                                                                                                                i2 = R.id.single_edit_text;
                                                                                                                EditText editText2 = (EditText) h5e.a(R.id.single_edit_text, viewInflate3);
                                                                                                                if (editText2 != null) {
                                                                                                                    i2 = R.id.space_bottom;
                                                                                                                    if (((Space) h5e.a(R.id.space_bottom, viewInflate3)) != null) {
                                                                                                                        i2 = R.id.status;
                                                                                                                        TextView textView15 = (TextView) h5e.a(R.id.status, viewInflate3);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i2 = R.id.status_icon;
                                                                                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.status_icon, viewInflate3);
                                                                                                                            if (appCompatImageView != null) {
                                                                                                                                i2 = R.id.team_name_info;
                                                                                                                                TextView textView16 = (TextView) h5e.a(R.id.team_name_info, viewInflate3);
                                                                                                                                if (textView16 != null) {
                                                                                                                                    i2 = R.id.undo;
                                                                                                                                    TextView textView17 = (TextView) h5e.a(R.id.undo, viewInflate3);
                                                                                                                                    if (textView17 != null) {
                                                                                                                                        return new cw2(new pgd0(constraintLayout, textView6, imageView, linearLayout, viewA2, keyboardView2, toggleButton, phd0VarA, viewA4, earlyPayoutCheckbox, dancingNumber, textView7, textView8, textView9, textView10, imageView2, linearLayout2, constraintLayout, textView11, textView12, textView13, linearLayout3, textView14, earlyPayoutCheckbox2, earlyPayoutCheckbox3, constraintLayout2, oneUpTwoUpItemControl, editText2, textView15, appCompatImageView, textView16, textView17), new z53(this));
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2 = i4;
                                                    }
                                                } else {
                                                    i2 = i4;
                                                }
                                            } else {
                                                i2 = i4;
                                            }
                                        } else {
                                            i2 = i4;
                                        }
                                    } else {
                                        i2 = i4;
                                    }
                                } else {
                                    i2 = i4;
                                }
                            } else {
                                i2 = i4;
                            }
                        } else {
                            i2 = R.id.custom_number_keyboard;
                        }
                    }
                } else {
                    i2 = i4;
                }
            } else {
                i2 = i4;
            }
        } else {
            i2 = R.id.additional_msg;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate3.getResources().getResourceName(i2)));
        return null;
    }
}
