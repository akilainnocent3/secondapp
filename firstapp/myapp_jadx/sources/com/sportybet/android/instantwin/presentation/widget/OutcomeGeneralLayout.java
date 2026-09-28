package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.appsflyer.internal.m;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ListenableSpinner;
import defpackage.bqe;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.r0b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003:\u0002\"\u0019B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f0\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0017R$\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010(\u001a\b\u0012\u0004\u0012\u00020!0 8\u0004@\u0004X\u0084.¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/widget/OutcomeGeneralLayout;", "T", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "outcomeType", "", "Lcom/sportybet/android/instantwin/presentation/widget/OutcomeGeneralLayout$b;", "outcomeDataList", "Lcom/sportybet/android/instantwin/presentation/widget/OutcomeGeneralLayout$a;", "listener", "", "setData", "(Ljava/lang/String;Ljava/util/List;Lcom/sportybet/android/instantwin/presentation/widget/OutcomeGeneralLayout$a;)V", "itemPerRow", "(Ljava/lang/String;Ljava/util/List;Lcom/sportybet/android/instantwin/presentation/widget/OutcomeGeneralLayout$a;I)V", "Lcom/sportybet/android/widget/ListenableSpinner;", "a", "Lcom/sportybet/android/widget/ListenableSpinner;", "getSpinner", "()Lcom/sportybet/android/widget/ListenableSpinner;", "setSpinner", "(Lcom/sportybet/android/widget/ListenableSpinner;)V", "spinner", "", "Lcom/sportybet/android/instantwin/presentation/widget/OutcomeButton;", "b", "[Lcom/sportybet/android/instantwin/presentation/widget/OutcomeButton;", "getOutcomeLayouts", "()[Lcom/sportybet/android/instantwin/presentation/widget/OutcomeButton;", "setOutcomeLayouts", "([Lcom/sportybet/android/instantwin/presentation/widget/OutcomeButton;)V", "outcomeLayouts", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class OutcomeGeneralLayout<T> extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ListenableSpinner spinner;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public OutcomeButton[] outcomeLayouts;
    public ArrayList c;
    public a<T> d;

    public interface a<T> {
        void a(T t);

        void b(T t);
    }

    public static final class b<T> {
        public final T a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public b(T t, String str, String str2, String str3, boolean z, boolean z2, boolean z3, boolean z4) {
            m.a(str, str2, str3);
            this.a = t;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = z4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h;
        }

        public final int hashCode() {
            T t = this.a;
            return Boolean.hashCode(this.h) + mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(gmf0.a((t == null ? 0 : t.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OutcomeData(data=");
            sb.append(this.a);
            sb.append(", odds=");
            sb.append(this.b);
            sb.append(", probability=");
            hxa.c(sb, this.c, ", description=", this.d, ", enable=");
            nng.a(", mutex=", ", isSelected=", sb, this.e, this.f);
            return lng.a(", isHighlighted=", ")", sb, this.g, this.h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutcomeGeneralLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.c = new ArrayList();
        View.inflate(context, R.layout.iwqk_layout_outcome_general, this);
        setOrientation(0);
        this.spinner = (ListenableSpinner) findViewById(R.id.outcome_spinner);
        View viewFindViewById = findViewById(R.id.outcome1);
        viewFindViewById.getClass();
        View viewFindViewById2 = findViewById(R.id.outcome2);
        viewFindViewById2.getClass();
        View viewFindViewById3 = findViewById(R.id.outcome3);
        viewFindViewById3.getClass();
        View viewFindViewById4 = findViewById(R.id.outcome4);
        viewFindViewById4.getClass();
        setOutcomeLayouts(new OutcomeButton[]{viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4});
        for (OutcomeButton outcomeButton : getOutcomeLayouts()) {
            outcomeButton.setOnClickListener(this);
        }
    }

    public final void a(int i, String str, List list) {
        String str2;
        String str3;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 >= i) {
                OutcomeButton outcomeButton = getOutcomeLayouts()[i2];
                outcomeButton.setEnabled(false);
                outcomeButton.setVisibility(8);
                outcomeButton.setOutcomeDescEnabled(false);
                outcomeButton.setOutcomeDescVisibility(8);
                outcomeButton.setOutcomeEnabled(false);
                outcomeButton.setOutcomeVisibility(8);
                outcomeButton.setLockVisibility(8);
            } else {
                b bVar = i2 < size ? (b) list.get(i2) : null;
                OutcomeButton outcomeButton2 = getOutcomeLayouts()[i2];
                outcomeButton2.setOutcomeEnabled(bVar != null && bVar.e);
                String str4 = "";
                if (bVar == null || (str2 = bVar.b) == null) {
                    str2 = "";
                }
                outcomeButton2.setOutcomeValue(str2);
                outcomeButton2.setOutcomeVisibility((bVar == null || !bVar.e) ? 8 : 0);
                outcomeButton2.setOutcomeDescEnabled(bVar != null && bVar.e);
                if (bVar != null && (str3 = bVar.d) != null) {
                    str4 = str3;
                }
                outcomeButton2.setOutcomeDesc(str4);
                outcomeButton2.setOutcomeDescVisibility((bVar == null || !bVar.e) ? 8 : 0);
                outcomeButton2.setLockVisibility((bVar == null || !bVar.e) ? 0 : 8);
                if (bVar == null || !bVar.f) {
                    boolean z = bVar != null && bVar.e;
                    boolean z2 = bVar != null && bVar.g;
                    int i3 = z ? z2 ? R.color.brand_tertiary : R.color.brand_secondary_variable_type2 : R.color.brand_secondary_variable_type1;
                    outcomeButton2.setOutcomeDescColor(outcomeButton2.getContext().getColor(i3));
                    outcomeButton2.setOutcomeColor(outcomeButton2.getContext().getColor(i3));
                    if (bVar == null || !bVar.h || z2 || !z) {
                        outcomeButton2.setBackgroundResource(R.drawable.iwqk_outcome_toggle_bg);
                    } else {
                        outcomeButton2.setBackgroundResource(R.drawable.iwqk_outcome_toggle_highlight);
                    }
                    outcomeButton2.setEnabled(z);
                    outcomeButton2.setSelected(z2);
                } else {
                    Context context = outcomeButton2.getContext();
                    context.getClass();
                    int i4 = r0b.d(context) ? R.color.text_disable_type2_primary : R.color.text_type1_secondary;
                    Context context2 = outcomeButton2.getContext();
                    context2.getClass();
                    int i5 = r0b.d(context2) ? R.color.background_disable_type2_primary : R.color.iv_outcome_mutex_bg;
                    outcomeButton2.setOutcomeDescColor(outcomeButton2.getContext().getColor(i4));
                    outcomeButton2.setOutcomeColor(outcomeButton2.getContext().getColor(i4));
                    outcomeButton2.setBackgroundColor(outcomeButton2.getContext().getColor(i5));
                    outcomeButton2.setEnabled(false);
                    outcomeButton2.setSelected(false);
                }
                outcomeButton2.setVisibility(i2 < size ? 0 : 4);
            }
            i2++;
        }
        if (TextUtils.equals(str, "event_detail")) {
            for (OutcomeButton outcomeButton3 : getOutcomeLayouts()) {
                if (TextUtils.isEmpty(((b) list.get(0)).d) || !outcomeButton3.a.isEnabled()) {
                    outcomeButton3.setOutcomeDescVisibility(8);
                } else {
                    outcomeButton3.setOutcomeDescVisibility(0);
                }
            }
            if (TextUtils.isEmpty(((b) list.get(0)).d)) {
                for (OutcomeButton outcomeButton4 : getOutcomeLayouts()) {
                    outcomeButton4.setOutcomeGravity(17);
                }
                return;
            }
            return;
        }
        for (OutcomeButton outcomeButton5 : getOutcomeLayouts()) {
            outcomeButton5.setOutcomeDescVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        float f = 190.0f;
        if (TextUtils.equals(str, "event_list_spinner")) {
            if (size == 2) {
                f = 126.0f;
            }
        } else if (size != 2 && size != 3) {
            f = 254.0f;
        }
        layoutParams.width = bqe.b(f, getContext());
        layoutParams.height = bqe.b(34.0f, getContext());
        setLayoutParams(layoutParams);
        for (OutcomeButton outcomeButton6 : getOutcomeLayouts()) {
            outcomeButton6.setOutcomeGravity(17);
            outcomeButton6.setPadding(0, 0, 0, 0);
        }
    }

    public final OutcomeButton[] getOutcomeLayouts() {
        OutcomeButton[] outcomeButtonArr = this.outcomeLayouts;
        if (outcomeButtonArr != null) {
            return outcomeButtonArr;
        }
        Intrinsics.n("outcomeLayouts");
        throw null;
    }

    public final ListenableSpinner getSpinner() {
        return this.spinner;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        Integer numValueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.outcome1) {
            i = 0;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.outcome2) {
            i = 1;
        } else if (numValueOf != null && numValueOf.intValue() == R.id.outcome3) {
            i = 2;
        } else {
            i = (numValueOf != null && numValueOf.intValue() == R.id.outcome4) ? 3 : -1;
        }
        if (i == -1 || this.d == null) {
            return;
        }
        boolean zIsSelected = getOutcomeLayouts()[i].isSelected();
        a<T> aVar = this.d;
        if (zIsSelected) {
            if (aVar != null) {
                aVar.b(((b) this.c.get(i)).a);
            }
        } else if (aVar != null) {
            aVar.a(((b) this.c.get(i)).a);
        }
    }

    public final void setData(String outcomeType, List<b<T>> outcomeDataList, a<T> listener) {
        outcomeType.getClass();
        outcomeDataList.getClass();
        listener.getClass();
        this.c = new ArrayList(outcomeDataList);
        this.d = listener;
        a(outcomeDataList.size(), outcomeType, outcomeDataList);
    }

    public final void setOutcomeLayouts(OutcomeButton[] outcomeButtonArr) {
        outcomeButtonArr.getClass();
        this.outcomeLayouts = outcomeButtonArr;
    }

    public final void setSpinner(ListenableSpinner listenableSpinner) {
        this.spinner = listenableSpinner;
    }

    public final void setData(String outcomeType, List<b<T>> outcomeDataList, a<T> listener, int itemPerRow) {
        outcomeType.getClass();
        outcomeDataList.getClass();
        listener.getClass();
        this.c = new ArrayList(outcomeDataList);
        this.d = listener;
        a(itemPerRow, outcomeType, outcomeDataList);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutcomeGeneralLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OutcomeGeneralLayout(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ OutcomeGeneralLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
