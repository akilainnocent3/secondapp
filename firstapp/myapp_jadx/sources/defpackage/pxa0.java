package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pxa0 extends RecyclerView.f<a> {
    public ArrayList a;

    public static final class a extends RecyclerView.d0 {
        public final yhs a;

        public a(yhs yhsVar) {
            super(yhsVar.a);
            this.a = yhsVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0129  */
    /*  JADX ERROR: UnsupportedOperationException in pass: SwitchBreakVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$BaseSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:210)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor$IterativeSwitchRegionVisitor.leaveRegion(SwitchBreakVisitor.java:177)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.runSwitchTraverse(SwitchBreakVisitor.java:52)
        	at jadx.core.dex.visitors.regions.SwitchBreakVisitor.visit(SwitchBreakVisitor.java:45)
        */
    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.d0 r10, int r11) {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxa0.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$d0, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewA = u540.a(viewGroup, R.layout.list_item_my_bets, viewGroup, false);
        int i2 = R.id.bet_amount;
        TextView textView = (TextView) h5e.a(R.id.bet_amount, viewA);
        if (textView != null) {
            i2 = R.id.bet_status_lost;
            TextView textView2 = (TextView) h5e.a(R.id.bet_status_lost, viewA);
            if (textView2 != null) {
                i2 = R.id.bet_status_win;
                ImageView imageView = (ImageView) h5e.a(R.id.bet_status_win, viewA);
                if (imageView != null) {
                    i2 = R.id.ic_fbg;
                    ImageView imageView2 = (ImageView) h5e.a(R.id.ic_fbg, viewA);
                    if (imageView2 != null) {
                        i2 = R.id.selected_tile;
                        TextView textView3 = (TextView) h5e.a(R.id.selected_tile, viewA);
                        if (textView3 != null) {
                            i2 = R.id.selected_tile_container;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.selected_tile_container, viewA);
                            if (constraintLayout != null) {
                                i2 = R.id.white_line;
                                View viewA2 = h5e.a(R.id.white_line, viewA);
                                if (viewA2 != null) {
                                    i2 = R.id.win_amount;
                                    TextView textView4 = (TextView) h5e.a(R.id.win_amount, viewA);
                                    if (textView4 != null) {
                                        return new a(new yhs((ConstraintLayout) viewA, textView, textView2, imageView, imageView2, textView3, constraintLayout, viewA2, textView4));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i2)));
        return null;
    }
}
