package com.google.gson;

import gm.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public interface v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f52572a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f52573b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f52574c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f52575d = new d();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements v {
        @Override // com.google.gson.v
        public e a(Class<?> cls) {
            return i0.f(cls) ? e.BLOCK_INACCESSIBLE : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_INACCESSIBLE_JAVA";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements v {
        @Override // com.google.gson.v
        public e a(Class<?> cls) {
            return i0.f(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_JAVA";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements v {
        @Override // com.google.gson.v
        public e a(Class<?> cls) {
            return i0.c(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_ANDROID";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements v {
        @Override // com.google.gson.v
        public e a(Class<?> cls) {
            return i0.e(cls) ? e.BLOCK_ALL : e.INDECISIVE;
        }

        public String toString() {
            return "ReflectionAccessFilter#BLOCK_ALL_PLATFORM";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum e {
        ALLOW,
        INDECISIVE,
        BLOCK_INACCESSIBLE,
        BLOCK_ALL
    }

    e a(Class<?> cls);
}
