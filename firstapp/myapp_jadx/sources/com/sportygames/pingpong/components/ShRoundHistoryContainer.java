package com.sportygames.pingpong.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pingpong.remote.models.PreviousMultiplierResponse;
import com.sportygames.sportyherov2.utils.FadingEdgeLayout;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.i820;
import defpackage.ibs;
import defpackage.py50;
import defpackage.y720;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sportygames/pingpong/components/ShRoundHistoryContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/pingpong/remote/models/PreviousMultiplierResponse;", "shMultiplierResponse", "Ly720;", "coefficientViewModel", "Libs;", "viewLifecycleOwner", "", "setChips", "(Lcom/sportygames/pingpong/remote/models/PreviousMultiplierResponse;Ly720;Libs;)V", "Li820;", "c", "Li820;", "getBinding", "()Li820;", "setBinding", "(Li820;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShRoundHistoryContainer extends LinearLayout {
    public ArrayList a;
    public py50 b;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public i820 binding;

    /* JADX INFO: renamed from: com.sportygames.pingpong.components.ShRoundHistoryContainer$setChips$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/sportygames/pingpong/components/ShRoundHistoryContainer$setChips$2", "Landroidx/recyclerview/widget/LinearLayoutManager;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pp_round_history_layout, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.arrow_image;
        ImageView imageView = (ImageView) h5e.a(R.id.arrow_image, viewInflate);
        if (imageView != null) {
            i = R.id.arrow_layout;
            if (((RelativeLayout) h5e.a(R.id.arrow_layout, viewInflate)) != null) {
                i = R.id.card;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.card, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.fade;
                    if (((FadingEdgeLayout) h5e.a(R.id.fade, viewInflate)) != null) {
                        i = R.id.list;
                        RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.list, viewInflate);
                        if (recyclerView != null) {
                            i = R.id.round;
                            TextView textView = (TextView) h5e.a(R.id.round, viewInflate);
                            if (textView != null) {
                                this.binding = new i820((ConstraintLayout) viewInflate, imageView, constraintLayout, recyclerView, textView);
                                return;
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public final i820 getBinding() {
        return this.binding;
    }

    public final void setBinding(i820 i820Var) {
        i820Var.getClass();
        this.binding = i820Var;
    }

    public final void setChips(PreviousMultiplierResponse shMultiplierResponse, y720 coefficientViewModel, ibs viewLifecycleOwner) {
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
                this.b = new py50(context, this.a, coefficientViewModel, viewLifecycleOwner);
            }
            this.binding.d.setItemAnimator(new h());
            py50 py50Var = this.b;
            if (py50Var == null) {
                Intrinsics.n("chipListAdapter");
                throw null;
            }
            py50Var.e = false;
            RecyclerView recyclerView = this.binding.d;
            getContext();
            recyclerView.setLayoutManager(new AnonymousClass2(0, false));
            RecyclerView recyclerView2 = this.binding.d;
            py50 py50Var2 = this.b;
            if (py50Var2 != null) {
                recyclerView2.setAdapter(py50Var2);
            } else {
                Intrinsics.n("chipListAdapter");
                throw null;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShRoundHistoryContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
