package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.plugin.realsports.prematch.data.PreMatchLoadingState;

/* JADX INFO: loaded from: classes7.dex */
public final class exs extends RecyclerView.d0 {
    public final gjd0 a;
    public final jip b;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PreMatchLoadingState.values().length];
            try {
                iArr[PreMatchLoadingState.READY_FOR_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreMatchLoadingState.LOADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreMatchLoadingState.LOAD_FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreMatchLoadingState.NO_MORE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public exs(gjd0 gjd0Var, jip jipVar) {
        super(gjd0Var.a);
        this.a = gjd0Var;
        this.b = jipVar;
        TextView textView = gjd0Var.d;
        textView.setVisibility(8);
        textView.setOnClickListener(new View.OnClickListener() { // from class: dxs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b.invoke(Boolean.TRUE);
            }
        });
    }
}
