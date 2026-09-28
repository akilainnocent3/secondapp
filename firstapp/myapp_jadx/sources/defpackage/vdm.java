package defpackage;

import android.view.View;
import com.sporty.android.core.model.config.BroadcastConfig;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class vdm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vdm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List<String> list = dfm.v2;
                sh8.c().e(((BroadcastConfig.Info) obj).getUrl());
                break;
            default:
                ggg0 ggg0Var = (ggg0) obj;
                Object tag = view.getTag();
                if (!(tag instanceof Pair)) {
                    tag = null;
                }
                Pair pair = (Pair) tag;
                if (pair != null) {
                    ggg0Var.b.a((String) pair.a, ((Boolean) pair.b).booleanValue());
                    break;
                }
                break;
        }
    }
}
