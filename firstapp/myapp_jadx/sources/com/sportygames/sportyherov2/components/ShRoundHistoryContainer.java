package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.PreviousMultiplierResponse;
import defpackage.bmy;
import defpackage.c28;
import defpackage.cw80;
import defpackage.h5e;
import defpackage.ibs;
import defpackage.kpu;
import defpackage.qy50;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/sportygames/sportyherov2/components/ShRoundHistoryContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/sportyherov2/remote/models/PreviousMultiplierResponse;", "shMultiplierResponse", "Lc28;", "coefficientViewModel", "Libs;", "viewLifecycleOwner", "", "setChips", "(Lcom/sportygames/sportyherov2/remote/models/PreviousMultiplierResponse;Lc28;Libs;)V", "", "height", "width", "setUiPercentageOfNestedElements", "(FF)V", "Lcw80;", "c", "Lcw80;", "getBinding", "()Lcw80;", "setBinding", "(Lcw80;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShRoundHistoryContainer extends LinearLayout {
    public ArrayList a;
    public qy50 b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public cw80 binding;

    /* JADX INFO: renamed from: com.sportygames.sportyherov2.components.ShRoundHistoryContainer$setChips$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sportygames/sportyherov2/components/ShRoundHistoryContainer$setChips$2", "Landroidx/recyclerview/widget/LinearLayoutManager;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends LinearLayoutManager {
        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean s() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
        public final boolean t() {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShRoundHistoryContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.a = new ArrayList();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sh_round_history_layout_v2, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.arrow_image;
        ImageView imageView = (ImageView) h5e.a(R.id.arrow_image, viewInflate);
        if (imageView != null) {
            i = R.id.arrow_layout;
            if (((RelativeLayout) h5e.a(R.id.arrow_layout, viewInflate)) != null) {
                i = R.id.card;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.card, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.list;
                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.list, viewInflate);
                    if (recyclerView != null) {
                        this.binding = new cw80((ConstraintLayout) viewInflate, imageView, constraintLayout, recyclerView);
                        return;
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final cw80 getBinding() {
        return this.binding;
    }

    public final void setBinding(cw80 cw80Var) {
        cw80Var.getClass();
        this.binding = cw80Var;
    }

    public final void setChips(PreviousMultiplierResponse shMultiplierResponse, c28 coefficientViewModel, ibs viewLifecycleOwner) {
        shMultiplierResponse.getClass();
        coefficientViewModel.getClass();
        viewLifecycleOwner.getClass();
        try {
            if (shMultiplierResponse.getCoefficients().size() <= shMultiplierResponse.getLimit()) {
                this.a.addAll(shMultiplierResponse.getCoefficients());
            }
            shMultiplierResponse.getLimit();
            Context context = getContext();
            if (context != null) {
                this.b = new qy50(context, this.a, coefficientViewModel, viewLifecycleOwner);
            }
            this.binding.d.setItemAnimator(new h());
            qy50 qy50Var = this.b;
            if (qy50Var == null) {
                Intrinsics.n("chipListAdapter");
                throw null;
            }
            qy50Var.e = false;
            RecyclerView recyclerView = this.binding.d;
            getContext();
            recyclerView.setLayoutManager(new AnonymousClass2(0, false));
            RecyclerView recyclerView2 = this.binding.d;
            qy50 qy50Var2 = this.b;
            if (qy50Var2 != null) {
                recyclerView2.setAdapter(qy50Var2);
            } else {
                Intrinsics.n("chipListAdapter");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    public final void setUiPercentageOfNestedElements(float height, float width) {
        float f = height / width;
        Float fValueOf = Float.valueOf(0.06f);
        Pair pair = new Pair("prev_multiplier_card_width", fValueOf);
        Float fValueOf2 = Float.valueOf(1.0f);
        Map mapF = kpu.f(pair, new Pair("prev_multiplier_card_height", fValueOf2));
        if (f >= 2.1f) {
            mapF = kpu.f(new Pair("prev_multiplier_card_width", fValueOf), new Pair("prev_multiplier_card_height", fValueOf2));
        } else if (f >= 2.0f) {
            mapF = kpu.f(new Pair("prev_multiplier_card_width", fValueOf), new Pair("prev_multiplier_card_height", fValueOf2));
        } else if (f >= 1.5f) {
            mapF = kpu.f(new Pair("prev_multiplier_card_width", fValueOf), new Pair("prev_multiplier_card_height", fValueOf2));
        }
        ViewGroup.LayoutParams layoutParams = this.binding.c.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Float f2 = (Float) mapF.get("prev_multiplier_card_height");
        layoutParams2.S = f2 != null ? f2.floatValue() : 1.0f;
        Float f3 = (Float) mapF.get("prev_multiplier_card_width");
        layoutParams2.R = f3 != null ? f3.floatValue() : 0.04f;
        this.binding.c.setLayoutParams(layoutParams2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShRoundHistoryContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
