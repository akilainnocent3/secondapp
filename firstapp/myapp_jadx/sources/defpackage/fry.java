package defpackage;

import com.sportygames.commons.SportyGamesManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class fry implements Function0<Boolean> {
    public final /* synthetic */ zqy a;

    public fry(zqy zqyVar) {
        this.a = zqyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.a.w0().getClass();
        return Boolean.valueOf(SportyGamesManager.getInstance().getUser() == null);
    }
}
