package defpackage;

import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.sportybet.android.gp.tz.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l590 extends x<Integer, b> {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class a extends n.e<Integer> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(Integer num, Integer num2) {
            return num.intValue() == num2.intValue();
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(Integer num, Integer num2) {
            return num.intValue() == num2.intValue();
        }
    }

    public static final class b extends RecyclerView.d0 {
        public static final /* synthetic */ int b = 0;
        public l2p a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        b bVar = (b) d0Var;
        bVar.getClass();
        l2p l2pVar = bVar.a;
        if (l2pVar == null) {
            Intrinsics.n("itemChatBinding");
            throw null;
        }
        l2pVar.d.c();
        l2pVar.e.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = b.b;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        layoutInflaterFrom.getClass();
        View viewInflate = layoutInflaterFrom.inflate(R.layout.item_chat_shimmer, viewGroup, false);
        int i3 = R.id.conversation;
        View viewA = h5e.a(R.id.conversation, viewInflate);
        if (viewA != null) {
            i3 = R.id.guideline;
            if (((Guideline) h5e.a(R.id.guideline, viewInflate)) != null) {
                i3 = R.id.guideline_internal;
                if (((Guideline) h5e.a(R.id.guideline_internal, viewInflate)) != null) {
                    i3 = R.id.icon_avatar;
                    if (((ImageView) h5e.a(R.id.icon_avatar, viewInflate)) != null) {
                        i3 = R.id.layout_conversation;
                        if (((ConstraintLayout) h5e.a(R.id.layout_conversation, viewInflate)) != null) {
                            i3 = R.id.name;
                            View viewA2 = h5e.a(R.id.name, viewInflate);
                            if (viewA2 != null) {
                                i3 = R.id.shimmer_view_name;
                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) h5e.a(R.id.shimmer_view_name, viewInflate);
                                if (shimmerFrameLayout != null) {
                                    i3 = R.id.shimmer_view_text;
                                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) h5e.a(R.id.shimmer_view_text, viewInflate);
                                    if (shimmerFrameLayout2 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        l2p l2pVar = new l2p(constraintLayout, viewA, viewA2, shimmerFrameLayout, shimmerFrameLayout2);
                                        constraintLayout.getClass();
                                        b bVar = new b(constraintLayout);
                                        com.facebook.shimmer.a.C0188a c0188aD = new com.facebook.shimmer.a.C0188a().g(1000L).e(0).f(0.3f).d(0.0f);
                                        PorterDuff.Mode mode = PorterDuff.Mode.SCREEN;
                                        c0188aD.a.q = mode;
                                        com.facebook.shimmer.a.C0188a c0188aH = c0188aD.h(1.0f);
                                        c0188aH.a.m = -20.0f;
                                        shimmerFrameLayout.b(c0188aH.a());
                                        com.facebook.shimmer.a.C0188a c0188aD2 = new com.facebook.shimmer.a.C0188a().g(1500L).e(0).f(0.3f).d(0.0f);
                                        c0188aD2.a.q = mode;
                                        com.facebook.shimmer.a.C0188a c0188aH2 = c0188aD2.h(1.0f);
                                        c0188aH2.a.m = -20.0f;
                                        shimmerFrameLayout2.b(c0188aH2.a());
                                        bVar.a = l2pVar;
                                        return bVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
        return null;
    }
}
