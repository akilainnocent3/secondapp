package defpackage;

import java.util.concurrent.ExecutorService;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fu5 implements oya {
    public static String a(String str, String str2, String str3) {
        return new Regex(str).replace(str2, str3);
    }

    @Override // defpackage.oya
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
