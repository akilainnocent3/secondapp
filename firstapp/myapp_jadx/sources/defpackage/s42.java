package defpackage;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s42<T> extends RecyclerView.f<a82> {
    public final Activity a;
    public final List<T> b;
    public boolean c;
    public boolean d;
    public String e;

    public s42(Activity activity, List<T> list) {
        this.a = activity;
        this.b = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public int getItemCount() {
        List<T> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size() + (this.c ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return (this.c && i == getItemCount() + (-1)) ? R.layout.spr_view_pull_to_refresh_recycler_footer : i(i);
    }

    public abstract int i(int i);

    public abstract a82 j(ViewGroup viewGroup, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((a82) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return i == R.layout.spr_view_pull_to_refresh_recycler_footer ? new a(dzc.a(viewGroup, i, viewGroup, false)) : j(viewGroup, i);
    }

    public class a extends a82 {
        public final ProgressBar a;
        public final TextView b;
        public final LinearLayout c;
        public final LinearLayout d;

        public a(View view) {
            super(view);
            this.a = (ProgressBar) view.findViewById(R.id.progress);
            this.b = (TextView) view.findViewById(R.id.hint);
            this.c = (LinearLayout) view.findViewById(R.id.loading_container);
            this.d = (LinearLayout) view.findViewById(R.id.hint_container);
        }

        @Override // defpackage.a82
        public final void a(int i) {
            s42 s42Var = s42.this;
            Activity activity = s42Var.a;
            boolean z = s42Var.d;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (!z) {
                progressBar.setVisibility(0);
                String[] strArrSplit = {""};
                if (!TextUtils.isEmpty(s42Var.e)) {
                    strArrSplit = s42Var.e.split("\\s+");
                }
                textView.setText(activity.getString(R.string.app_common__loading_more_num, strArrSplit[strArrSplit.length - 1]));
                return;
            }
            progressBar.setVisibility(8);
            if (TextUtils.isEmpty(s42Var.e)) {
                textView.setText(sn5.b(activity, R.string.common_feedback__no_more_data, new Object[0]));
                return;
            }
            this.c.setVisibility(0);
            textView.setVisibility(0);
            this.d.setVisibility(8);
            textView.setText(s42Var.e);
        }

        @Override // defpackage.a82
        public final void b(int i, View view) {
        }
    }
}
