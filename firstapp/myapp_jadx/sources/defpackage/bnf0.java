package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bnf0 {
    public static /* synthetic */ int a(String str) {
        if (str == null) {
            bmy.a("Name is null");
            return 0;
        }
        if (str.equals("Nearest")) {
            return 1;
        }
        if (str.equals("Linear")) {
            return 2;
        }
        if (str.equals("MipMap")) {
            return 3;
        }
        if (str.equals("MipMapNearestNearest")) {
            return 4;
        }
        if (str.equals("MipMapLinearNearest")) {
            return 5;
        }
        if (str.equals("MipMapNearestLinear")) {
            return 6;
        }
        if (str.equals("MipMapLinearLinear")) {
            return 7;
        }
        hb5.a("No enum constant com.badlogic.gdx.graphics.Texture.TextureFilter.".concat(str));
        return 0;
    }
}
