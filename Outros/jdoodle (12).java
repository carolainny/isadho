"use strict";
(self.webpackChunkrunning = self.webpackChunkrunning || []).push([[108], {
    90508: (le,B,d)=>{
        d.d(B, {
            BQ: ()=>c,
            X2: ()=>ce,
            uc: ()=>pe,
            nP: ()=>ye,
            us: ()=>De,
            wG: ()=>ve,
            si: ()=>Me,
            pj: ()=>m,
            Kr: ()=>k,
            Id: ()=>D,
            sb: ()=>j,
            E0: ()=>de
        });
        var V = d(53713)
          , F = d(16111)
          , I = d(44083)
          , S = d(6360)
          , _ = d(28551)
          , v = d(56213)
          , u = d(5e3)
          , R = d(50226)
          , l = d(69808)
          , O = d(70925)
          , w = d(83368)
          , C = d(63191)
          , U = d(1059);
        function b(i, n, e) {
            return n = (0,
            I.Z)(n),
            (0,
            V.Z)(i, (0,
            F.Z)() ? Reflect.construct(n, e || [], (0,
            I.Z)(i).constructor) : n.apply(i, e))
        }
        var f = new u.InjectionToken("mat-sanity-checks",{
            providedIn: "root",
            factory: function q() {
                return !0
            }
        })
          , c = function() {
            var i = function() {
                return (0,
                _.Z)(function n(e, t, a) {
                    (0,
                    v.Z)(this, n),
                    this._sanityChecks = t,
                    this._document = a,
                    this._hasDoneGlobalChecks = !1,
                    e._applyBodyHighContrastModeCssClasses(),
                    this._hasDoneGlobalChecks || (this._hasDoneGlobalChecks = !0)
                }, [{
                    key: "_checkIsEnabled",
                    value: function(t) {
                        return !(0,
                        O.Oy)() && ("boolean" == typeof this._sanityChecks ? this._sanityChecks : !!this._sanityChecks[t])
                    }
                }])
            }();
            return i.\u0275fac = function(e) {
                return new (e || i)(u.\u0275\u0275inject(w.qm),u.\u0275\u0275inject(f, 8),u.\u0275\u0275inject(l.DOCUMENT))
            }
            ,
            i.\u0275mod = u.\u0275\u0275defineNgModule({
                type: i
            }),
            i.\u0275inj = u.\u0275\u0275defineInjector({
                imports: [R.vT, R.vT]
            }),
            i
        }();
        function D(i) {
            return function(n) {
                function e() {
                    var t;
                    (0,
                    v.Z)(this, e);
                    for (var a = arguments.length, r = new Array(a), o = 0; o < a; o++)
                        r[o] = arguments[o];
                    return (t = b(this, e, [].concat(r)))._disabled = !1,
                    t
                }
                return (0,
                S.Z)(e, n),
                (0,
                _.Z)(e, [{
                    key: "disabled",
                    get: function() {
                        return this._disabled
                    },
                    set: function(a) {
                        this._disabled = (0,
                        C.Ig)(a)
                    }
                }])
            }(i)
        }
        function m(i, n) {
            return function(e) {
                function t() {
                    var a;
                    (0,
                    v.Z)(this, t);
                    for (var r = arguments.length, o = new Array(r), h = 0; h < r; h++)
                        o[h] = arguments[h];
                    return (a = b(this, t, [].concat(o))).defaultColor = n,
                    a.color = n,
                    a
                }
                return (0,
                S.Z)(t, e),
                (0,
                _.Z)(t, [{
                    key: "color",
                    get: function() {
                        return this._color
                    },
                    set: function(r) {
                        var o = r || this.defaultColor;
                        o !== this._color && (this._color && this._elementRef.nativeElement.classList.remove("mat-".concat(this._color)),
                        o && this._elementRef.nativeElement.classList.add("mat-".concat(o)),
                        this._color = o)
                    }
                }])
            }(i)
        }
        function k(i) {
            return function(n) {
                function e() {
                    var t;
                    (0,
                    v.Z)(this, e);
                    for (var a = arguments.length, r = new Array(a), o = 0; o < a; o++)
                        r[o] = arguments[o];
                    return (t = b(this, e, [].concat(r)))._disableRipple = !1,
                    t
                }
                return (0,
                S.Z)(e, n),
                (0,
                _.Z)(e, [{
                    key: "disableRipple",
                    get: function() {
                        return this._disableRipple
                    },
                    set: function(a) {
                        this._disableRipple = (0,
                        C.Ig)(a)
                    }
                }])
            }(i)
        }
        function j(i) {
            var n = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : 0;
            return function(e) {
                function t() {
                    var a;
                    (0,
                    v.Z)(this, t);
                    for (var r = arguments.length, o = new Array(r), h = 0; h < r; h++)
                        o[h] = arguments[h];
                    return (a = b(this, t, [].concat(o)))._tabIndex = n,
                    a.defaultTabIndex = n,
                    a
                }
                return (0,
                S.Z)(t, e),
                (0,
                _.Z)(t, [{
                    key: "tabIndex",
                    get: function() {
                        return this.disabled ? -1 : this._tabIndex
                    },
                    set: function(r) {
                        this._tabIndex = null != r ? (0,
                        C.su)(r) : this.defaultTabIndex
                    }
                }])
            }(i)
        }
        var ce = function() {
            var i = (0,
            _.Z)(function n() {
                (0,
                v.Z)(this, n)
            });
            return i.\u0275fac = function(e) {
                return new (e || i)
            }
            ,
            i.\u0275dir = u.\u0275\u0275defineDirective({
                type: i,
                selectors: [["", "mat-line", ""], ["", "matLine", ""]],
                hostAttrs: [1, "mat-line"]
            }),
            i
        }();
        function de(i, n) {
            var e = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : "mat";
            i.changes.pipe((0,
            U.O)(i)).subscribe(function(t) {
                var a = t.length;
                N(n, "".concat(e, "-2-line"), !1),
                N(n, "".concat(e, "-3-line"), !1),
                N(n, "".concat(e, "-multi-line"), !1),
                2 === a || 3 === a ? N(n, "".concat(e, "-").concat(a, "-line"), !0) : a > 3 && N(n, "".concat(e, "-multi-line"), !0)
            })
        }
        function N(i, n, e) {
            i.nativeElement.classList.toggle(n, e)
        }
        var pe = function() {
            var i = (0,
            _.Z)(function n() {
                (0,
                v.Z)(this, n)
            });
            return i.\u0275fac = function(e) {
                return new (e || i)
            }
            ,
            i.\u0275mod = u.\u0275\u0275defineNgModule({
                type: i
            }),
            i.\u0275inj = u.\u0275\u0275defineInjector({
                imports: [c, c]
            }),
            i
        }()
          , fe = function() {
            return (0,
            _.Z)(function i(n, e, t) {
                var a = arguments.length > 3 && void 0 !== arguments[3] && arguments[3];
                (0,
                v.Z)(this, i),
                this._renderer = n,
                this.element = e,
                this.config = t,
                this._animationForciblyDisabledThroughCss = a,
                this.state = 3
            }, [{
                key: "fadeOut",
                value: function() {
                    this._renderer.fadeOutRipple(this)
                }
            }])
        }()
          , ee = {
            enterDuration: 225,
            exitDuration: 150
        }
          , Y = (0,
        O.i$)({
            passive: !0
        })
          , te = ["mousedown", "touchstart"]
          , ne = ["mouseup", "mouseleave", "touchend", "touchcancel"]
          , me = function() {
            return (0,
            _.Z)(function i(n, e, t, a) {
                (0,
                v.Z)(this, i),
                this._target = n,
                this._ngZone = e,
                this._isPointerDown = !1,
                this._activeRipples = new Map,
                this._pointerUpEventsRegistered = !1,
                a.isBrowser && (this._containerElement = (0,
                C.fI)(t))
            }, [{
                key: "fadeInRipple",
                value: function(e, t) {
                    var a = this
                      , r = arguments.length > 2 && void 0 !== arguments[2] ? arguments[2] : {}
                      , o = this._containerRect = this._containerRect || this._containerElement.getBoundingClientRect()
                      , h = Object.assign(Object.assign({}, ee), r.animation);
                    r.centered && (e = o.left + o.width / 2,
                    t = o.top + o.height / 2);
                    var T = r.radius || ge(e, t, o)
                      , be = e - o.left
                      , ke = t - o.top
                      , z = h.enterDuration
                      , M = document.createElement("div");
                    M.classList.add("mat-ripple-element"),
                    M.style.left = "".concat(be - T, "px"),
                    M.style.top = "".concat(ke - T, "px"),
                    M.style.height = "".concat(2 * T, "px"),
                    M.style.width = "".concat(2 * T, "px"),
                    null != r.color && (M.style.backgroundColor = r.color),
                    M.style.transitionDuration = "".concat(z, "ms"),
                    this._containerElement.appendChild(M);
                    var ie = window.getComputedStyle(M)
                      , Ee = ie.transitionProperty
                      , ae = ie.transitionDuration
                      , X = "none" === Ee || "0s" === ae || "0s, 0s" === ae
                      , x = new fe(this,M,r,X);
                    M.style.transform = "scale3d(1, 1, 1)",
                    x.state = 0,
                    r.persistent || (this._mostRecentTransientRipple = x);
                    var re = null;
                    return !X && (z || h.exitDuration) && this._ngZone.runOutsideAngular(function() {
                        var oe = function() {
                            return a._finishRippleTransition(x)
                        }
                          , se = function() {
                            return a._destroyRipple(x)
                        };
                        M.addEventListener("transitionend", oe),
                        M.addEventListener("transitioncancel", se),
                        re = {
                            onTransitionEnd: oe,
                            onTransitionCancel: se
                        }
                    }),
                    this._activeRipples.set(x, re),
                    (X || !z) && this._finishRippleTransition(x),
                    x
                }
            }, {
                key: "fadeOutRipple",
                value: function(e) {
                    if (2 !== e.state && 3 !== e.state) {
                        var t = e.element
                          , a = Object.assign(Object.assign({}, ee), e.config.animation);
                        t.style.transitionDuration = "".concat(a.exitDuration, "ms"),
                        t.style.opacity = "0",
                        e.state = 2,
                        (e._animationForciblyDisabledThroughCss || !a.exitDuration) && this._finishRippleTransition(e)
                    }
                }
            }, {
                key: "fadeOutAll",
                value: function() {
                    this._getActiveRipples().forEach(function(e) {
                        return e.fadeOut()
                    })
                }
            }, {
                key: "fadeOutAllNonPersistent",
                value: function() {
                    this._getActiveRipples().forEach(function(e) {
                        e.config.persistent || e.fadeOut()
                    })
                }
            }, {
                key: "setupTriggerEvents",
                value: function(e) {
                    var t = (0,
                    C.fI)(e);
                    !t || t === this._triggerElement || (this._removeTriggerEvents(),
                    this._triggerElement = t,
                    this._registerEvents(te))
                }
            }, {
                key: "handleEvent",
                value: function(e) {
                    "mousedown" === e.type ? this._onMousedown(e) : "touchstart" === e.type ? this._onTouchStart(e) : this._onPointerUp(),
                    this._pointerUpEventsRegistered || (this._registerEvents(ne),
                    this._pointerUpEventsRegistered = !0)
                }
            }, {
                key: "_finishRippleTransition",
                value: function(e) {
                    0 === e.state ? this._startFadeOutTransition(e) : 2 === e.state && this._destroyRipple(e)
                }
            }, {
                key: "_startFadeOutTransition",
                value: function(e) {
                    var t = e === this._mostRecentTransientRipple
                      , a = e.config.persistent;
                    e.state = 1,
                    !a && (!t || !this._isPointerDown) && e.fadeOut()
                }
            }, {
                key: "_destroyRipple",
                value: function(e) {
                    var t, a = null !== (t = this._activeRipples.get(e)) && void 0 !== t ? t : null;
                    this._activeRipples.delete(e),
                    this._activeRipples.size || (this._containerRect = null),
                    e === this._mostRecentTransientRipple && (this._mostRecentTransientRipple = null),
                    e.state = 3,
                    null !== a && (e.element.removeEventListener("transitionend", a.onTransitionEnd),
                    e.element.removeEventListener("transitioncancel", a.onTransitionCancel)),
                    e.element.remove()
                }
            }, {
                key: "_onMousedown",
                value: function(e) {
                    var t = (0,
                    w.X6)(e)
                      , a = this._lastTouchStartEvent && Date.now() < this._lastTouchStartEvent + 800;
                    !this._target.rippleDisabled && !t && !a && (this._isPointerDown = !0,
                    this.fadeInRipple(e.clientX, e.clientY, this._target.rippleConfig))
                }
            }, {
                key: "_onTouchStart",
                value: function(e) {
                    if (!this._target.rippleDisabled && !(0,
                    w.yG)(e)) {
                        this._lastTouchStartEvent = Date.now(),
                        this._isPointerDown = !0;
                        for (var t = e.changedTouches, a = 0; a < t.length; a++)
                            this.fadeInRipple(t[a].clientX, t[a].clientY, this._target.rippleConfig)
                    }
                }
            }, {
                key: "_onPointerUp",
                value: function() {
                    !this._isPointerDown || (this._isPointerDown = !1,
                    this._getActiveRipples().forEach(function(e) {
                        !e.config.persistent && (1 === e.state || e.config.terminateOnPointerUp && 0 === e.state) && e.fadeOut()
                    }))
                }
            }, {
                key: "_registerEvents",
                value: function(e) {
                    var t = this;
                    this._ngZone.runOutsideAngular(function() {
                        e.forEach(function(a) {
                            t._triggerElement.addEventListener(a, t, Y)
                        })
                    })
                }
            }, {
                key: "_getActiveRipples",
                value: function() {
                    return Array.from(this._activeRipples.keys())
                }
            }, {
                key: "_removeTriggerEvents",
                value: function() {
                    var e = this;
                    this._triggerElement && (te.forEach(function(t) {
                        e._triggerElement.removeEventListener(t, e, Y)
                    }),
                    this._pointerUpEventsRegistered && ne.forEach(function(t) {
                        e._triggerElement.removeEventListener(t, e, Y)
                    }))
                }
            }])
        }();
        function ge(i, n, e) {
            var t = Math.max(Math.abs(i - e.left), Math.abs(i - e.right))
              , a = Math.max(Math.abs(n - e.top), Math.abs(n - e.bottom));
            return Math.sqrt(t * t + a * a)
        }
        var _e = new u.InjectionToken("mat-ripple-global-options")
          , ve = function() {
            var i = function() {
                return (0,
                _.Z)(function n(e, t, a, r, o) {
                    (0,
                    v.Z)(this, n),
                    this._elementRef = e,
                    this._animationMode = o,
                    this.radius = 0,
                    this._disabled = !1,
                    this._isInitialized = !1,
                    this._globalOptions = r || {},
                    this._rippleRenderer = new me(this,t,e,a)
                }, [{
                    key: "disabled",
                    get: function() {
                        return this._disabled
                    },
                    set: function(t) {
                        t && this.fadeOutAllNonPersistent(),
                        this._disabled = t,
                        this._setupTriggerEventsIfEnabled()
                    }
                }, {
                    key: "trigger",
                    get: function() {
                        return this._trigger || this._elementRef.nativeElement
                    },
                    set: function(t) {
                        this._trigger = t,
                        this._setupTriggerEventsIfEnabled()
                    }
                }, {
                    key: "ngOnInit",
                    value: function() {
                        this._isInitialized = !0,
                        this._setupTriggerEventsIfEnabled()
                    }
                }, {
                    key: "ngOnDestroy",
                    value: function() {
                        this._rippleRenderer._removeTriggerEvents()
                    }
                }, {
                    key: "fadeOutAll",
                    value: function() {
                        this._rippleRenderer.fadeOutAll()
                    }
                }, {
                    key: "fadeOutAllNonPersistent",
                    value: function() {
                        this._rippleRenderer.fadeOutAllNonPersistent()
                    }
                }, {
                    key: "rippleConfig",
                    get: function() {
                        return {
                            centered: this.centered,
                            radius: this.radius,
                            color: this.color,
                            animation: Object.assign(Object.assign(Object.assign({}, this._globalOptions.animation), "NoopAnimations" === this._animationMode ? {
                                enterDuration: 0,
                                exitDuration: 0
                            } : {}), this.animation),
                            terminateOnPointerUp: this._globalOptions.terminateOnPointerUp
                        }
                    }
                }, {
                    key: "rippleDisabled",
                    get: function() {
                        return this.disabled || !!this._globalOptions.disabled
                    }
                }, {
                    key: "_setupTriggerEventsIfEnabled",
                    value: function() {
                        !this.disabled && this._isInitialized && this._rippleRenderer.setupTriggerEvents(this.trigger)
                    }
                }, {
                    key: "launch",
                    value: function(t) {
                        var a = arguments.length > 1 && void 0 !== arguments[1] ? arguments[1] : 0
                          , r = arguments.length > 2 ? arguments[2] : void 0;
                        return "number" == typeof t ? this._rippleRenderer.fadeInRipple(t, a, Object.assign(Object.assign({}, this.rippleConfig), r)) : this._rippleRenderer.fadeInRipple(0, 0, Object.assign(Object.assign({}, this.rippleConfig), t))
                    }
                }])
            }();
            return i.\u0275fac = function(e) {
                return new (e || i)(u.\u0275\u0275directiveInject(u.ElementRef),u.\u0275\u0275directiveInject(u.NgZone),u.\u0275\u0275directiveInject(O.t4),u.\u0275\u0275directiveInject(_e, 8),u.\u0275\u0275directiveInject(u.ANIMATION_MODULE_TYPE, 8))
            }
            ,
            i.\u0275dir = u.\u0275\u0275defineDirective({
                type: i,
                selectors: [["", "mat-ripple", ""], ["", "matRipple", ""]],
                hostAttrs: [1, "mat-ripple"],
                hostVars: 2,
                hostBindings: function(e, t) {
                    2 & e && u.\u0275\u0275classProp("mat-ripple-unbounded", t.unbounded)
                },
                inputs: {
                    color: ["matRippleColor", "color"],
                    unbounded: ["matRippleUnbounded", "unbounded"],
                    centered: ["matRippleCentered", "centered"],
                    radius: ["matRippleRadius", "radius"],
                    animation: ["matRippleAnimation", "animation"],
                    disabled: ["matRippleDisabled", "disabled"],
                    trigger: ["matRippleTrigger", "trigger"]
                },
                exportAs: ["matRipple"]
            }),
            i
        }()
          , Me = function() {
            var i = (0,
            _.Z)(function n() {
                (0,
                v.Z)(this, n)
            });
            return i.\u0275fac = function(e) {
                return new (e || i)
            }
            ,
            i.\u0275mod = u.\u0275\u0275defineNgModule({
                type: i
            }),
            i.\u0275inj = u.\u0275\u0275defineInjector({
                imports: [c, c]
            }),
            i
        }()
          , ye = function() {
            var i = (0,
            _.Z)(function n(e) {
                (0,
                v.Z)(this, n),
                this._animationMode = e,
                this.state = "unchecked",
                this.disabled = !1
            });
            return i.\u0275fac = function(e) {
                return new (e || i)(u.\u0275\u0275directiveInject(u.ANIMATION_MODULE_TYPE, 8))
            }
            ,
            i.\u0275cmp = u.\u0275\u0275defineComponent({
                type: i,
                selectors: [["mat-pseudo-checkbox"]],
                hostAttrs: [1, "mat-pseudo-checkbox"],
                hostVars: 8,
                hostBindings: function(e, t) {
                    2 & e && u.\u0275\u0275classProp("mat-pseudo-checkbox-indeterminate", "indeterminate" === t.state)("mat-pseudo-checkbox-checked", "checked" === t.state)("mat-pseudo-checkbox-disabled", t.disabled)("_mat-animation-noopable", "NoopAnimations" === t._animationMode)
                },
                inputs: {
                    state: "state",
                    disabled: "disabled"
                },
                decls: 0,
                vars: 0,
                template: function(e, t) {},
                styles: ['.mat-pseudo-checkbox{width:16px;height:16px;border:2px solid;border-radius:2px;cursor:pointer;display:inline-block;vertical-align:middle;box-sizing:border-box;position:relative;flex-shrink:0;transition:border-color 90ms cubic-bezier(0, 0, 0.2, 0.1),background-color 90ms cubic-bezier(0, 0, 0.2, 0.1)}.mat-pseudo-checkbox::after{position:absolute;opacity:0;content:"";border-bottom:2px solid currentColor;transition:opacity 90ms cubic-bezier(0, 0, 0.2, 0.1)}.mat-pseudo-checkbox.mat-pseudo-checkbox-checked,.mat-pseudo-checkbox.mat-pseudo-checkbox-indeterminate{border-color:rgba(0,0,0,0)}.mat-pseudo-checkbox._mat-animation-noopable{transition:none !important;animation:none !important}.mat-pseudo-checkbox._mat-animation-noopable::after{transition:none}.mat-pseudo-checkbox-disabled{cursor:default}.mat-pseudo-checkbox-indeterminate::after{top:5px;left:1px;width:10px;opacity:1;border-radius:2px}.mat-pseudo-checkbox-checked::after{top:2.4px;left:1px;width:8px;height:3px;border-left:2px solid currentColor;transform:rotate(-45deg);opacity:1;box-sizing:content-box}'],
                encapsulation: 2,
                changeDetection: 0
            }),
            i
        }()
          , De = function() {
            var i = (0,
            _.Z)(function n() {
                (0,
                v.Z)(this, n)
            });
            return i.\u0275fac = function(e) {
                return new (e || i)
            }
            ,
            i.\u0275mod = u.\u0275\u0275defineNgModule({
                type: i
            }),
            i.\u0275inj = u.\u0275\u0275defineInjector({
                imports: [c]
            }),
            i
        }()
    }
    ,
    20773: (le,B,d)=>{
        d.d(B, {
            Cq: ()=>J,
            Ou: ()=>A
        });
        var V = d(53713)
          , F = d(16111)
          , I = d(44083)
          , S = d(6360)
          , _ = d(28551)
          , v = d(56213)
          , u = d(63191)
          , R = d(70925)
          , E = d(69808)
          , l = d(5e3)
          , O = d(90508)
          , w = d(24096)
          , C = d(29071);
        function G(f, c) {
            if (1 & f && (l.\u0275\u0275namespaceSVG(),
            l.\u0275\u0275element(0, "circle", 4)),
            2 & f) {
                var s = l.\u0275\u0275nextContext()
                  , p = l.\u0275\u0275reference(1);
                l.\u0275\u0275styleProp("animation-name", "mat-progress-spinner-stroke-rotate-" + s._spinnerAnimationLabel)("stroke-dashoffset", s._getStrokeDashOffset(), "px")("stroke-dasharray", s._getStrokeCircumference(), "px")("stroke-width", s._getCircleStrokeWidth(), "%")("transform-origin", s._getCircleTransformOrigin(p)),
                l.\u0275\u0275attribute("r", s._getCircleRadius())
            }
        }
        function b(f, c) {
            if (1 & f && (l.\u0275\u0275namespaceSVG(),
            l.\u0275\u0275element(0, "circle", 4)),
            2 & f) {
                var s = l.\u0275\u0275nextContext()
                  , p = l.\u0275\u0275reference(1);
                l.\u0275\u0275styleProp("stroke-dashoffset", s._getStrokeDashOffset(), "px")("stroke-dasharray", s._getStrokeCircumference(), "px")("stroke-width", s._getCircleStrokeWidth(), "%")("transform-origin", s._getCircleTransformOrigin(p)),
                l.\u0275\u0275attribute("r", s._getCircleRadius())
            }
        }
        var H = (0,
        O.pj)((0,
        _.Z)(function f(c) {
            (0,
            v.Z)(this, f),
            this._elementRef = c
        }), "primary")
          , $ = new l.InjectionToken("mat-progress-spinner-default-options",{
            providedIn: "root",
            factory: function Q() {
                return {
                    diameter: 100
                }
            }
        })
          , A = function(f) {
            function c(s, p, y, D, m, k, j, Z) {
                var g;
                (0,
                v.Z)(this, c),
                g = function U(f, c, s) {
                    return c = (0,
                    I.Z)(c),
                    (0,
                    V.Z)(f, (0,
                    F.Z)() ? Reflect.construct(c, s || [], (0,
                    I.Z)(f).constructor) : c.apply(f, s))
                }(this, c, [s]),
                g._document = y,
                g._diameter = 100,
                g._value = 0,
                g._resizeSubscription = w.w.EMPTY,
                g.mode = "determinate";
                var W = c._diameters;
                return g._spinnerAnimationLabel = g._getSpinnerAnimationLabel(),
                W.has(y.head) || W.set(y.head, new Set([100])),
                g._noopAnimations = "NoopAnimations" === D && !!m && !m._forceAnimations,
                "mat-spinner" === s.nativeElement.nodeName.toLowerCase() && (g.mode = "indeterminate"),
                m && (m.color && (g.color = g.defaultColor = m.color),
                m.diameter && (g.diameter = m.diameter),
                m.strokeWidth && (g.strokeWidth = m.strokeWidth)),
                p.isBrowser && p.SAFARI && j && k && Z && (g._resizeSubscription = j.change(150).subscribe(function() {
                    "indeterminate" === g.mode && Z.run(function() {
                        return k.markForCheck()
                    })
                })),
                g
            }
            return (0,
            S.Z)(c, f),
            (0,
            _.Z)(c, [{
                key: "diameter",
                get: function() {
                    return this._diameter
                },
                set: function(p) {
                    this._diameter = (0,
                    u.su)(p),
                    this._spinnerAnimationLabel = this._getSpinnerAnimationLabel(),
                    this._styleRoot && this._attachStyleNode()
                }
            }, {
                key: "strokeWidth",
                get: function() {
                    return this._strokeWidth || this.diameter / 10
                },
                set: function(p) {
                    this._strokeWidth = (0,
                    u.su)(p)
                }
            }, {
                key: "value",
                get: function() {
                    return "determinate" === this.mode ? this._value : 0
                },
                set: function(p) {
                    this._value = Math.max(0, Math.min(100, (0,
                    u.su)(p)))
                }
            }, {
                key: "ngOnInit",
                value: function() {
                    var p = this._elementRef.nativeElement;
                    this._styleRoot = (0,
                    R.kV)(p) || this._document.head,
                    this._attachStyleNode(),
                    p.classList.add("mat-progress-spinner-indeterminate-animation")
                }
            }, {
                key: "ngOnDestroy",
                value: function() {
                    this._resizeSubscription.unsubscribe()
                }
            }, {
                key: "_getCircleRadius",
                value: function() {
                    return (this.diameter - 10) / 2
                }
            }, {
                key: "_getViewBox",
                value: function() {
                    var p = 2 * this._getCircleRadius() + this.strokeWidth;
                    return "0 0 ".concat(p, " ").concat(p)
                }
            }, {
                key: "_getStrokeCircumference",
                value: function() {
                    return 2 * Math.PI * this._getCircleRadius()
                }
            }, {
                key: "_getStrokeDashOffset",
                value: function() {
                    return "determinate" === this.mode ? this._getStrokeCircumference() * (100 - this._value) / 100 : null
                }
            }, {
                key: "_getCircleStrokeWidth",
                value: function() {
                    return this.strokeWidth / this.diameter * 100
                }
            }, {
                key: "_getCircleTransformOrigin",
                value: function(p) {
                    var y, D = 50 * (null !== (y = p.currentScale) && void 0 !== y ? y : 1);
                    return "".concat(D, "% ").concat(D, "%")
                }
            }, {
                key: "_attachStyleNode",
                value: function() {
                    var p = this._styleRoot
                      , y = this._diameter
                      , D = c._diameters
                      , m = D.get(p);
                    if (!m || !m.has(y)) {
                        var k = this._document.createElement("style");
                        k.setAttribute("mat-spinner-animation", this._spinnerAnimationLabel),
                        k.textContent = this._getAnimationText(),
                        p.appendChild(k),
                        m || D.set(p, m = new Set),
                        m.add(y)
                    }
                }
            }, {
                key: "_getAnimationText",
                value: function() {
                    var p = this._getStrokeCircumference();
                    return "\n @keyframes mat-progress-spinner-stroke-rotate-DIAMETER {\n    0%      { stroke-dashoffset: START_VALUE;  transform: rotate(0); }\n    12.5%   { stroke-dashoffset: END_VALUE;    transform: rotate(0); }\n    12.5001%  { stroke-dashoffset: END_VALUE;    transform: rotateX(180deg) rotate(72.5deg); }\n    25%     { stroke-dashoffset: START_VALUE;  transform: rotateX(180deg) rotate(72.5deg); }\n\n    25.0001%   { stroke-dashoffset: START_VALUE;  transform: rotate(270deg); }\n    37.5%   { stroke-dashoffset: END_VALUE;    transform: rotate(270deg); }\n    37.5001%  { stroke-dashoffset: END_VALUE;    transform: rotateX(180deg) rotate(161.5deg); }\n    50%     { stroke-dashoffset: START_VALUE;  transform: rotateX(180deg) rotate(161.5deg); }\n\n    50.0001%  { stroke-dashoffset: START_VALUE;  transform: rotate(180deg); }\n    62.5%   { stroke-dashoffset: END_VALUE;    transform: rotate(180deg); }\n    62.5001%  { stroke-dashoffset: END_VALUE;    transform: rotateX(180deg) rotate(251.5deg); }\n    75%     { stroke-dashoffset: START_VALUE;  transform: rotateX(180deg) rotate(251.5deg); }\n\n    75.0001%  { stroke-dashoffset: START_VALUE;  transform: rotate(90deg); }\n    87.5%   { stroke-dashoffset: END_VALUE;    transform: rotate(90deg); }\n    87.5001%  { stroke-dashoffset: END_VALUE;    transform: rotateX(180deg) rotate(341.5deg); }\n    100%    { stroke-dashoffset: START_VALUE;  transform: rotateX(180deg) rotate(341.5deg); }\n  }\n".replace(/START_VALUE/g, "".concat(.95 * p)).replace(/END_VALUE/g, "".concat(.2 * p)).replace(/DIAMETER/g, "".concat(this._spinnerAnimationLabel))
                }
            }, {
                key: "_getSpinnerAnimationLabel",
                value: function() {
                    return this.diameter.toString().replace(".", "_")
                }
            }])
        }(H);
        A._diameters = new WeakMap,
        A.\u0275fac = function(c) {
            return new (c || A)(l.\u0275\u0275directiveInject(l.ElementRef),l.\u0275\u0275directiveInject(R.t4),l.\u0275\u0275directiveInject(E.DOCUMENT, 8),l.\u0275\u0275directiveInject(l.ANIMATION_MODULE_TYPE, 8),l.\u0275\u0275directiveInject($),l.\u0275\u0275directiveInject(l.ChangeDetectorRef),l.\u0275\u0275directiveInject(C.rL),l.\u0275\u0275directiveInject(l.NgZone))
        }
        ,
        A.\u0275cmp = l.\u0275\u0275defineComponent({
            type: A,
            selectors: [["mat-progress-spinner"], ["mat-spinner"]],
            hostAttrs: ["role", "progressbar", "tabindex", "-1", 1, "mat-progress-spinner", "mat-spinner"],
            hostVars: 10,
            hostBindings: function(c, s) {
                2 & c && (l.\u0275\u0275attribute("aria-valuemin", "determinate" === s.mode ? 0 : null)("aria-valuemax", "determinate" === s.mode ? 100 : null)("aria-valuenow", "determinate" === s.mode ? s.value : null)("mode", s.mode),
                l.\u0275\u0275styleProp("width", s.diameter, "px")("height", s.diameter, "px"),
                l.\u0275\u0275classProp("_mat-animation-noopable", s._noopAnimations))
            },
            inputs: {
                color: "color",
                diameter: "diameter",
                strokeWidth: "strokeWidth",
                mode: "mode",
                value: "value"
            },
            exportAs: ["matProgressSpinner"],
            features: [l.\u0275\u0275InheritDefinitionFeature],
            decls: 4,
            vars: 8,
            consts: [["preserveAspectRatio", "xMidYMid meet", "focusable", "false", "aria-hidden", "true", 3, "ngSwitch"], ["svg", ""], ["cx", "50%", "cy", "50%", 3, "animation-name", "stroke-dashoffset", "stroke-dasharray", "stroke-width", "transform-origin", 4, "ngSwitchCase"], ["cx", "50%", "cy", "50%", 3, "stroke-dashoffset", "stroke-dasharray", "stroke-width", "transform-origin", 4, "ngSwitchCase"], ["cx", "50%", "cy", "50%"]],
            template: function(c, s) {
                1 & c && (l.\u0275\u0275namespaceSVG(),
                l.\u0275\u0275elementStart(0, "svg", 0, 1),
                l.\u0275\u0275template(2, G, 1, 11, "circle", 2),
                l.\u0275\u0275template(3, b, 1, 9, "circle", 3),
                l.\u0275\u0275elementEnd()),
                2 & c && (l.\u0275\u0275styleProp("width", s.diameter, "px")("height", s.diameter, "px"),
                l.\u0275\u0275property("ngSwitch", "indeterminate" === s.mode),
                l.\u0275\u0275attribute("viewBox", s._getViewBox()),
                l.\u0275\u0275advance(2),
                l.\u0275\u0275property("ngSwitchCase", !0),
                l.\u0275\u0275advance(1),
                l.\u0275\u0275property("ngSwitchCase", !1))
            },
            dependencies: [E.NgSwitch, E.NgSwitchCase],
            styles: [".mat-progress-spinner{display:block;position:relative;overflow:hidden}.mat-progress-spinner svg{position:absolute;transform:rotate(-90deg);top:0;left:0;transform-origin:center;overflow:visible}.mat-progress-spinner circle{fill:rgba(0,0,0,0);transition:stroke-dashoffset 225ms linear}.cdk-high-contrast-active .mat-progress-spinner circle{stroke:CanvasText}.mat-progress-spinner[mode=indeterminate] svg{animation:mat-progress-spinner-linear-rotate 2000ms linear infinite}.mat-progress-spinner[mode=indeterminate] circle{transition-property:stroke;animation-duration:4000ms;animation-timing-function:cubic-bezier(0.35, 0, 0.25, 1);animation-iteration-count:infinite}.mat-progress-spinner._mat-animation-noopable svg,.mat-progress-spinner._mat-animation-noopable circle{animation:none;transition:none}@keyframes mat-progress-spinner-linear-rotate{0%{transform:rotate(0deg)}100%{transform:rotate(360deg)}}@keyframes mat-progress-spinner-stroke-rotate-100{0%{stroke-dashoffset:268.606171575px;transform:rotate(0)}12.5%{stroke-dashoffset:56.5486677px;transform:rotate(0)}12.5001%{stroke-dashoffset:56.5486677px;transform:rotateX(180deg) rotate(72.5deg)}25%{stroke-dashoffset:268.606171575px;transform:rotateX(180deg) rotate(72.5deg)}25.0001%{stroke-dashoffset:268.606171575px;transform:rotate(270deg)}37.5%{stroke-dashoffset:56.5486677px;transform:rotate(270deg)}37.5001%{stroke-dashoffset:56.5486677px;transform:rotateX(180deg) rotate(161.5deg)}50%{stroke-dashoffset:268.606171575px;transform:rotateX(180deg) rotate(161.5deg)}50.0001%{stroke-dashoffset:268.606171575px;transform:rotate(180deg)}62.5%{stroke-dashoffset:56.5486677px;transform:rotate(180deg)}62.5001%{stroke-dashoffset:56.5486677px;transform:rotateX(180deg) rotate(251.5deg)}75%{stroke-dashoffset:268.606171575px;transform:rotateX(180deg) rotate(251.5deg)}75.0001%{stroke-dashoffset:268.606171575px;transform:rotate(90deg)}87.5%{stroke-dashoffset:56.5486677px;transform:rotate(90deg)}87.5001%{stroke-dashoffset:56.5486677px;transform:rotateX(180deg) rotate(341.5deg)}100%{stroke-dashoffset:268.606171575px;transform:rotateX(180deg) rotate(341.5deg)}}"],
            encapsulation: 2,
            changeDetection: 0
        });
        var J = function() {
            var f = (0,
            _.Z)(function c() {
                (0,
                v.Z)(this, c)
            });
            return f.\u0275fac = function(s) {
                return new (s || f)
            }
            ,
            f.\u0275mod = l.\u0275\u0275defineNgModule({
                type: f
            }),
            f.\u0275inj = l.\u0275\u0275defineInjector({
                imports: [O.BQ, E.CommonModule, O.BQ]
            }),
            f
        }()
    }
}]);
