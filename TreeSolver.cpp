#include <cmath>
#include <iostream>
#include <limits>
#include <sstream>
#include <string>
#include <vector>

struct Vec2 {
  double x, y;
};

int main() {
  std::cin.sync_with_stdio(false);
  std::ios_base::sync_with_stdio(false);
  std::cin.tie(NULL);
  int n;
  std::cin >> n;
  std::vector<Vec2> coords;
  coords.reserve(n);

  for (int i = 0; i < n; i++) {
    Vec2 v;

    std::cin >> v.x >> v.y;
    coords.emplace_back(v);
  }
  double dist = std::numeric_limits<double>::max();
  Vec2 minVec{std::numeric_limits<double>::max(),
              std::numeric_limits<double>::max()};

  for (auto &i : coords) {
    for (auto &j : coords) {

      if ((i.x == j.x) && (i.y == j.y))
        continue;
      Vec2 vec = {abs((i.x - j.x)), abs((i.y - j.y))};

      if ((minVec.x > vec.x) || (minVec.y > vec.y)) {
        double a = vec.x * vec.x;
        double b = vec.y * vec.y;
        double c = sqrt(a + b);
        if (dist > c)
          dist = c;
      }
    }
  }

  std::cout << dist;
}