package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public final class cmr extends RecyclerView.d0 {
    public final TextView a;
    public final ImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmr(View view) {
        super(view);
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.language);
        viewFindViewById.getClass();
        this.a = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.selected);
        viewFindViewById2.getClass();
        this.b = (ImageView) viewFindViewById2;
    }
}
