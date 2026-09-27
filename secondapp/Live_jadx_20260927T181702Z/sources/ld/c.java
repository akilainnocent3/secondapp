package ld;

import android.util.Pair;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f103866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f103867c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SecretKey f103865a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlgorithmParameterSpec f103868d = new md.a().a();

    public final Pair a(String str) {
        if (this.f103866b != null) {
            return d.a(this.f103865a, str);
        }
        return null;
    }

    public final String b(String str, byte[] bArr) {
        if (this.f103867c != null) {
            return a.a(a.b(2, bArr, this.f103865a), str);
        }
        return null;
    }

    public final void c() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        gd.b.a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(to.c.asp, "AndroidKeyStore");
            keyGenerator.init(this.f103868d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f103865a = (SecretKey) key;
            this.f103866b = new d();
            this.f103867c = new b();
        }
    }
}
