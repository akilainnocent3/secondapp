package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: loaded from: classes4.dex */
public final class wm {
    static {
        aw20[] aw20VarArr = {new nn(vm.class)};
        HashMap map = new HashMap();
        aw20 aw20Var = aw20VarArr[0];
        boolean zContainsKey = map.containsKey(aw20Var.a);
        Class<PrimitiveT> cls = aw20Var.a;
        if (zContainsKey) {
            hb5.a(kv50.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, aw20Var);
        GenericDeclaration genericDeclaration = aw20VarArr[0].a;
        Collections.unmodifiableMap(map);
        aw20[] aw20VarArr2 = {new jo(vm.class)};
        HashMap map2 = new HashMap();
        aw20 aw20Var2 = aw20VarArr2[0];
        boolean zContainsKey2 = map2.containsKey(aw20Var2.a);
        Class<PrimitiveT> cls2 = aw20Var2.a;
        if (zContainsKey2) {
            hb5.a(kv50.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map2.put(cls2, aw20Var2);
        GenericDeclaration genericDeclaration2 = aw20VarArr2[0].a;
        Collections.unmodifiableMap(map2);
        aw20[] aw20VarArr3 = {new so(vm.class)};
        HashMap map3 = new HashMap();
        aw20 aw20Var3 = aw20VarArr3[0];
        boolean zContainsKey3 = map3.containsKey(aw20Var3.a);
        Class<PrimitiveT> cls3 = aw20Var3.a;
        if (zContainsKey3) {
            hb5.a(kv50.a(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map3.put(cls3, aw20Var3);
        GenericDeclaration genericDeclaration3 = aw20VarArr3[0].a;
        Collections.unmodifiableMap(map3);
        aw20[] aw20VarArr4 = {new yn(vm.class)};
        HashMap map4 = new HashMap();
        aw20 aw20Var4 = aw20VarArr4[0];
        boolean zContainsKey4 = map4.containsKey(aw20Var4.a);
        Class<PrimitiveT> cls4 = aw20Var4.a;
        if (zContainsKey4) {
            hb5.a(kv50.a(cls4, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map4.put(cls4, aw20Var4);
        GenericDeclaration genericDeclaration4 = aw20VarArr4[0].a;
        Collections.unmodifiableMap(map4);
        aw20[] aw20VarArr5 = {new nqp(vm.class)};
        HashMap map5 = new HashMap();
        aw20 aw20Var5 = aw20VarArr5[0];
        boolean zContainsKey5 = map5.containsKey(aw20Var5.a);
        Class<PrimitiveT> cls5 = aw20Var5.a;
        if (zContainsKey5) {
            hb5.a(kv50.a(cls5, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map5.put(cls5, aw20Var5);
        GenericDeclaration genericDeclaration5 = aw20VarArr5[0].a;
        Collections.unmodifiableMap(map5);
        aw20[] aw20VarArr6 = {new uqp(vm.class)};
        HashMap map6 = new HashMap();
        aw20 aw20Var6 = aw20VarArr6[0];
        boolean zContainsKey6 = map6.containsKey(aw20Var6.a);
        Class<PrimitiveT> cls6 = aw20Var6.a;
        if (zContainsKey6) {
            hb5.a(kv50.a(cls6, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map6.put(cls6, aw20Var6);
        GenericDeclaration genericDeclaration6 = aw20VarArr6[0].a;
        Collections.unmodifiableMap(map6);
        aw20[] aw20VarArr7 = {new xv6(vm.class)};
        HashMap map7 = new HashMap();
        aw20 aw20Var7 = aw20VarArr7[0];
        boolean zContainsKey7 = map7.containsKey(aw20Var7.a);
        Class<PrimitiveT> cls7 = aw20Var7.a;
        if (zContainsKey7) {
            hb5.a(kv50.a(cls7, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map7.put(cls7, aw20Var7);
        GenericDeclaration genericDeclaration7 = aw20VarArr7[0].a;
        Collections.unmodifiableMap(map7);
        aw20[] aw20VarArr8 = {new h8k0(vm.class)};
        HashMap map8 = new HashMap();
        aw20 aw20Var8 = aw20VarArr8[0];
        boolean zContainsKey8 = map8.containsKey(aw20Var8.a);
        Class<PrimitiveT> cls8 = aw20Var8.a;
        if (zContainsKey8) {
            hb5.a(kv50.a(cls8, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map8.put(cls8, aw20Var8);
        GenericDeclaration genericDeclaration8 = aw20VarArr8[0].a;
        Collections.unmodifiableMap(map8);
        int i = z050.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        y050.h(zm.b);
        vhu.a();
        y050.f(new on(ln.class, new nn(vm.class)), true);
        y050.f(new ko(ho.class, new jo(vm.class)), true);
        zrz zrzVar = no.a;
        ttw ttwVar = ttw.b;
        ttwVar.e(no.a);
        ttwVar.d(no.b);
        ttwVar.c(no.c);
        ttwVar.b(no.d);
        if (byf0.a()) {
            return;
        }
        y050.f(new zn(wn.class, new yn(vm.class)), true);
        ttwVar.e(eo.a);
        ttwVar.d(eo.b);
        ttwVar.c(eo.c);
        ttwVar.b(eo.d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            y050.f(new to(qo.class, new so(vm.class)), true);
            ttwVar.e(wo.a);
            ttwVar.d(wo.b);
            ttwVar.c(wo.c);
            ttwVar.b(wo.d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        y050.f(new yv6(uv6.class, new xv6(vm.class)), true);
        zrz zrzVar2 = bw6.a;
        ttw ttwVar2 = ttw.b;
        ttwVar2.e(bw6.a);
        ttwVar2.d(bw6.b);
        ttwVar2.c(bw6.c);
        ttwVar2.b(bw6.d);
        y050.f(new oqp(lqp.class, new nqp(vm.class)), true);
        y050.f(new vqp(sqp.class, new uqp(vm.class)), true);
        y050.f(new i8k0(e8k0.class, new h8k0(vm.class)), true);
        ttwVar2.e(l8k0.a);
        ttwVar2.d(l8k0.b);
        ttwVar2.c(l8k0.c);
        ttwVar2.b(l8k0.d);
    }
}
