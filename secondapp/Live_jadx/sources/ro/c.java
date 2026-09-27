package ro;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1224c f127435a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f127436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f127437c;

        public a(final String val$data, final d val$callback) {
            this.f127436b = val$data;
            this.f127437c = val$callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strD = c.this.d(this.f127436b);
                if (strD == null) {
                    this.f127437c.onError(new Exception("Encrypt return null, it normally occurs when you send a null data"));
                }
                this.f127437c.onSuccess(strD);
            } catch (Exception e10) {
                this.f127437c.onError(e10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f127439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f127440c;

        public b(final String val$data, final d val$callback) {
            this.f127439b = val$data;
            this.f127440c = val$callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String strA = c.this.a(this.f127439b);
                if (strA == null) {
                    this.f127440c.onError(new Exception("Decrypt return null, it normally occurs when you send a null data"));
                }
                this.f127440c.onSuccess(strA);
            } catch (Exception e10) {
                this.f127440c.onError(e10);
            }
        }
    }

    /* JADX INFO: renamed from: ro.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1224c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f127442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f127443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f127444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f127445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f127446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f127447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f127448g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f127449h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public String f127450i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f127451j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f127452k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f127453l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public SecureRandom f127454m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public IvParameterSpec f127455n;

        public static C1224c q(String key, String salt, byte[] iv2) {
            return new C1224c().H(iv2).J(key).M(salt).L(128).K(to.c.asp).E("UTF8").G(1).F("SHA1").D(0).C("AES/CBC/PKCS5Padding").P("SHA1PRNG").N(to.c.instanceVal);
        }

        public final SecureRandom A() {
            return this.f127454m;
        }

        public final String B() {
            return this.f127453l;
        }

        public C1224c C(String algorithm) {
            this.f127448g = algorithm;
            return this;
        }

        public C1224c D(int base64Mode) {
            this.f127444c = base64Mode;
            return this;
        }

        public C1224c E(String charsetName) {
            this.f127450i = charsetName;
            return this;
        }

        public C1224c F(String digestAlgorithm) {
            this.f127452k = digestAlgorithm;
            return this;
        }

        public C1224c G(int iterationCount) {
            this.f127445d = iterationCount;
            return this;
        }

        public C1224c H(byte[] iv2) {
            this.f127442a = iv2;
            return this;
        }

        public C1224c I(IvParameterSpec ivParameterSpec) {
            this.f127455n = ivParameterSpec;
            return this;
        }

        public C1224c J(String key) {
            this.f127447f = key;
            return this;
        }

        public C1224c K(String keyAlgorithm) {
            this.f127449h = keyAlgorithm;
            return this;
        }

        public C1224c L(int keyLength) {
            this.f127443b = keyLength;
            return this;
        }

        public C1224c M(String salt) {
            this.f127446e = salt;
            return this;
        }

        public C1224c N(String secretKeyType) {
            this.f127451j = secretKeyType;
            return this;
        }

        public C1224c O(SecureRandom secureRandom) {
            this.f127454m = secureRandom;
            return this;
        }

        public C1224c P(String secureRandomAlgorithm) {
            this.f127453l = secureRandomAlgorithm;
            return this;
        }

        public c m() throws NoSuchAlgorithmException {
            O(SecureRandom.getInstance(B()));
            I(new IvParameterSpec(t()));
            return new c(this);
        }

        public final String n() {
            return this.f127448g;
        }

        public final int o() {
            return this.f127444c;
        }

        public final String p() {
            return this.f127450i;
        }

        public final String r() {
            return this.f127452k;
        }

        public final int s() {
            return this.f127445d;
        }

        public final byte[] t() {
            return this.f127442a;
        }

        public final IvParameterSpec u() {
            return this.f127455n;
        }

        public final String v() {
            return this.f127447f;
        }

        public final String w() {
            return this.f127449h;
        }

        public final int x() {
            return this.f127443b;
        }

        public final String y() {
            return this.f127446e;
        }

        public final String z() {
            return this.f127451j;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void onError(Exception exception);

        void onSuccess(String result);
    }

    public static c g(String key, String salt, byte[] iv2) {
        try {
            return C1224c.q(key, salt, iv2).m();
        } catch (NoSuchAlgorithmException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String a(String data) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        if (data == null) {
            return null;
        }
        byte[] bArrA = ro.a.a(data, this.f127435a.o());
        SecretKey secretKeyH = h(i(this.f127435a.v()));
        Cipher cipher = Cipher.getInstance(this.f127435a.n());
        cipher.init(2, secretKeyH, this.f127435a.u(), this.f127435a.A());
        return new String(cipher.doFinal(bArrA));
    }

    public void b(final String data, final d callback) {
        if (callback == null) {
            return;
        }
        new Thread(new b(data, callback)).start();
    }

    public String c(String data) {
        try {
            return a(data);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public String d(String data) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException, InvalidAlgorithmParameterException {
        if (data == null) {
            return null;
        }
        SecretKey secretKeyH = h(i(this.f127435a.v()));
        byte[] bytes = data.getBytes(this.f127435a.p());
        Cipher cipher = Cipher.getInstance(this.f127435a.n());
        cipher.init(1, secretKeyH, this.f127435a.u(), this.f127435a.A());
        return ro.a.f(cipher.doFinal(bytes), this.f127435a.o());
    }

    public void e(final String data, final d callback) {
        if (callback == null) {
            return;
        }
        new Thread(new a(data, callback)).start();
    }

    public String f(String data) {
        try {
            return d(data);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final SecretKey h(char[] key) throws InvalidKeySpecException, NoSuchAlgorithmException, UnsupportedEncodingException {
        return new SecretKeySpec(SecretKeyFactory.getInstance(this.f127435a.z()).generateSecret(new PBEKeySpec(key, this.f127435a.y().getBytes(this.f127435a.p()), this.f127435a.s(), this.f127435a.x())).getEncoded(), this.f127435a.w());
    }

    public final char[] i(String key) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance(this.f127435a.r());
        messageDigest.update(key.getBytes(this.f127435a.p()));
        return ro.a.f(messageDigest.digest(), 1).toCharArray();
    }

    public c(C1224c builder) {
        this.f127435a = builder;
    }
}
