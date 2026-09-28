package defpackage;

import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes4.dex */
public final class hnm {
    public static final Regex a = new Regex("<(/?)(\\w+)([^>]*?)(/?)>");
    public static final Regex b = new Regex("(\\w+)=\"([^\"]*)\"");
    public static final Set<String> c = ay0.V(new String[]{"br", "hr", "img"});
}
