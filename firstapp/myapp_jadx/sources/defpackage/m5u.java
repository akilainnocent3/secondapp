package defpackage;

import com.sporty.android.core.model.pocket.common.AssetData;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m5u implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ m5u(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws UnsupportedEncodingException {
        switch (this.a) {
            case 0:
                Pair pair = (Pair) obj;
                pair.getClass();
                n5u n5uVar = n5u.a;
                String str = (String) pair.a;
                n5uVar.getClass();
                Charset charset = StandardCharsets.UTF_8;
                String strEncode = URLEncoder.encode(str, charset.name());
                strEncode.getClass();
                String strP = c.p(strEncode, "+", "%20", false);
                String strEncode2 = URLEncoder.encode((String) pair.b, charset.name());
                strEncode2.getClass();
                return tug.a(strP, "=", c.p(strEncode2, "+", "%20", false));
            default:
                AssetData assetData = (AssetData) obj;
                assetData.getClass();
                List<AssetData.AccountsBean> accounts = assetData.getAccounts();
                return accounts == null ? m2g.a : accounts;
        }
    }
}
