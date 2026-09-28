package defpackage;

import android.content.ContextWrapper;
import android.content.res.Configuration;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ln5 extends n1b {
    public final boolean g;
    public final Configuration h;
    public final jb40 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln5(ContextWrapper contextWrapper, boolean z, Configuration configuration, jb40 jb40Var) {
        super(contextWrapper, R.style.Theme_AppCompat_Empty);
        jb40Var.getClass();
        this.g = z;
        this.h = configuration;
        this.i = jb40Var;
    }

    @Override // defpackage.n1b
    public final void a(Configuration configuration) {
        int i = configuration.uiMode;
        configuration.setTo(this.h);
        configuration.uiMode = i;
        super.a(configuration);
    }
}
