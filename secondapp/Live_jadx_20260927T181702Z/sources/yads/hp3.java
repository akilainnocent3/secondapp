package yads;

import android.content.Context;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hp3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cp3 f150216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f150217b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public to2 f150218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f150219d;

    public hp3(cp3 cp3Var) {
        this.f150216a = cp3Var;
    }

    public final void a(Context context, List list, to2 to2Var, Object obj) {
        if (list.isEmpty()) {
            to2Var.onSuccess(this.f150217b);
            return;
        }
        this.f150218c = to2Var;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ud3 ud3Var = (ud3) it.next();
            this.f150219d++;
            cp3 cp3Var = this.f150216a;
            gp3 gp3Var = new gp3(this);
            cp3Var.getClass();
            dp3 dp3Var = new dp3(gp3Var, new ep3(context, ud3Var));
            pe3 pe3Var = cp3Var.f147865e;
            lu2 lu2Var = cp3Var.f147862b;
            d4 d4Var = cp3Var.f147861a;
            rc3 rc3Var = cp3Var.f147863c;
            fg3 fg3Var = cp3Var.f147864d;
            pe3Var.getClass();
            zc3 zc3Var = new zc3();
            String string = ud3Var.f156374i;
            if (string == null) {
                string = "";
            }
            Uri uri = Uri.parse(string);
            if (fr.r0.a2((List) z91.f158668a.getValue(), uri.getHost())) {
                string = ml2.a(uri, new yc3(zc3Var, rc3Var, d4Var, context)).toString();
            }
            String str = string;
            mp3 mp3Var = new mp3(fg3Var);
            qm3 qm3Var = new qm3(dp3Var);
            at1 at1VarA = ((iu3) lu2Var).a();
            ey2.f148881a.getClass();
            ey2 ey2VarA = dy2.a(context);
            dd3 dd3Var = new dd3(context, d4Var, at1VarA, str, qm3Var, ud3Var, mp3Var, ey2VarA, new ay2(ey2VarA), new ic3(context, at1VarA));
            dd3Var.f154034q = obj;
            pe3Var.f153913a.a(dd3Var);
        }
    }
}
