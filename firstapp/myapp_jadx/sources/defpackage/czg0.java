package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public class czg0 extends Fragment {
    public int a = 0;

    public static czg0 j0(int i, String str) {
        czg0 czg0Var = new czg0();
        Bundle bundle = new Bundle();
        bundle.putInt("position", i);
        bundle.putString("nextPage", str);
        czg0Var.setArguments(bundle);
        return czg0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.sg_ss_fragment_tutorial, viewGroup, false);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.image);
        TextView textView = (TextView) viewInflate.findViewById(R.id.title);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.message);
        if (getArguments() != null) {
            this.a = getArguments().getInt("position");
        }
        fbn fbnVarA = th8.a();
        int i = this.a;
        if (i == 0) {
            fbnVarA.a("https://s.sporty.net/ke/main/res/3425bae48567d7a9b678822ab4e0d3c4.png", imageView);
            textView.setText(R.string.sg_sporty_soccer_get_started);
            textView2.setText(R.string.sg_sporty_soccer_get_started_msg);
            return viewInflate;
        }
        if (i == 1) {
            fbnVarA.a("https://s.sporty.net/ke/main/res/f27577b5f6542ad511566e1bb1c7343e.png", imageView);
            textView.setText(R.string.sg_sporty_soccer_win_10_times);
            textView2.setText(R.string.sg_sporty_soccer_win_10_times_msg);
            return viewInflate;
        }
        if (i != 2) {
            return viewInflate;
        }
        fbnVarA.a("https://s.sporty.net/ke/main/res/8ee7307fb6fbeb8d9722cd4927b0357c.png", imageView);
        textView.setText(R.string.sg_sporty_soccer_watch_out);
        textView2.setText(R.string.sg_sporty_soccer_watch_out_msg);
        return viewInflate;
    }
}
