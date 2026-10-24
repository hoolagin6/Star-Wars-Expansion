# Star Wars Expansion (Minecraft 1.21.1 branch)

Port of the [Star Wars Expansion mod](https://github.com/MrFazCraft/Star-Wars-Expansion) (originally built with MCreator for Minecraft **1.20.1 / NeoForge**) to **Minecraft 1.21.1 / NeoForge 21.1**, keeping the original MCreator workflow intact.

The original 1.20.1 version lives on the [`main`](https://github.com/hoolagin6/Star-Wars-Expansion/tree/main) branch; all 1.21.1 work happens on this branch.

## What was changed for 1.21.1

- **NeoForge 21.1.x + GeckoLib 4.6.6** (MCreator-ported build pipeline; `gradlew build` produces a working jar).
- Data-driven worldgen: dimension types, biomes, structure sets, template pools, and placed features now use the 1.21 JSON formats (`UniformInt` flat keys, height providers, etc.).
- Jigsaw structures (`tatooine_village`, `jawa_sandcrawler`, `tusken_campment`, `hutt_palace`, `jedi_temple`, ...) generate through `structure_set` + structure `biomes` entries; `.nbt` templates live under `data/star_wars_expansion/structure/` (**singular** — 1.21 renamed what used to be `structures/`).
- Client entry points use `@EventBusSubscriber(Dist.CLIENT)` (the old `FileLocator`-style per-item `bus.register` setup was crashy on the event bus).
- Armor materials are registry-backed records with real `ArmorMaterial.Layer` texture entries; each armor piece maps to its Blockbench model texture under `textures/models/armor/<asset>_layer_1/2.png`.
- GUI buttons render via the 1.21 **GUI sprite atlas**: widget sprites live under `textures/gui/sprites/**` and are referenced without the `textures/` prefix and `.png` suffix.

## Building

```sh
./gradlew build
```

Output jar lands in `build/libs/`. Requires NeoForge 21.1 (via the included gradle setup) and Java 21+.

## Credits

Original mod: **MrFazCraft** (open the 1.20.1 version from the `main` branch). Porting: see commit history on this branch.
