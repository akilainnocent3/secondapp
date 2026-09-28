package defpackage;

import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes4.dex */
public enum w75 implements csm<w75> {
    CONTROL("control"),
    VARIANT_1("variant_1");

    public static final a b = new a();
    public static final List<String> c = b.k("deposit_completed", "ftd_conversion", "preset_deposit_completed", "target_chip_clicked");
    public final String a;

    public static final class a {
    }

    w75(String str) {
        this.a = str;
    }

    @Override // defpackage.csm
    public final Enum getDefault() {
        return CONTROL;
    }

    @Override // defpackage.csm
    public final String getValue() {
        return this.a;
    }
}
